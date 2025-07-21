package com.aws.ccamilo.com.app.retoawsusers.facade.impl;

import com.aws.ccamilo.com.app.retoawsusers.domain.model.Users;
import com.aws.ccamilo.com.app.retoawsusers.facade.IUsersRepositorieFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UsersRepositorieFacade implements IUsersRepositorieFacade {
    @Override
    public Users save(Users users) {
        return null;
    }

    @Override
    public Users findByidentificacion(String identificacion) {
        return null;
    }
}
