package com.aws.ccamilo.com.app.retoawsusers.facade.impl;

import com.aws.ccamilo.com.app.retoawsusers.commons.constast.ErrorException;
import com.aws.ccamilo.com.app.retoawsusers.domain.model.Users;
import com.aws.ccamilo.com.app.retoawsusers.exception.UserNotFoundException;
import com.aws.ccamilo.com.app.retoawsusers.exception.UserPersistenceException;
import com.aws.ccamilo.com.app.retoawsusers.facade.IUsersRepositorieFacade;
import com.aws.ccamilo.com.app.retoawsusers.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Slf4j
@Transactional
public class UsersRepositorieFacade implements IUsersRepositorieFacade {

    private final UsersRepository usersRepository;

    @Override
    public Users save(Users users) {
        try {
            return usersRepository.save(users);
        } catch (Exception e) {
            log.error("Error al guardar el usuario: {}", users, e);
            throw new UserPersistenceException(ErrorException.USER_SAVE_ERROR_MESSAGE.getMessage(), e);
        }

    }

    @Override
    public Users findByIdentification(String identificacion) {
        try {
            return usersRepository.findByIdentifier(identificacion)
                    .orElseThrow(()-> new UserNotFoundException(ErrorException.USER_QUERY_ERROR_MESSAGE.getMessage() + identificacion));
        }catch (UserNotFoundException e) {
            throw  e;
        }
        catch (Exception e) {
            log.error("Error al consultar usuario por identificador: {}", identificacion, e);
            throw new UserPersistenceException(ErrorException.USER_QUERY_ERROR_MESSAGE.getMessage(), e);
        }
    }
}
