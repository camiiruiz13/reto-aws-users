package com.aws.ccamilo.com.app.retoawsusers.domain.service.impl;

import com.aws.ccamilo.com.app.retoawsusers.commons.mapper.EntityDTOBuilder;
import com.aws.ccamilo.com.app.retoawsusers.domain.model.Users;
import com.aws.ccamilo.com.app.retoawsusers.domain.service.IUsersService;
import com.aws.ccamilo.com.app.retoawsusers.dto.request.UsersDTORequest;
import com.aws.ccamilo.com.app.retoawsusers.dto.response.UsersDTOResponse;
import com.aws.ccamilo.com.app.retoawsusers.facade.IUsersRepositorieFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsersService implements IUsersService {

    private final IUsersRepositorieFacade repositorieFacade;

    @Override
    public void saveUser(UsersDTORequest usersDTORequest) {
        Users users  = EntityDTOBuilder.mapDtoToEntity(usersDTORequest, Users.class);
        repositorieFacade.save(users);
    }

    @Override
    public UsersDTOResponse findByIdentifier(String identifier) {
        Users users  = repositorieFacade.findByIdentification(identifier);
        return EntityDTOBuilder.mapEntityToDto(users, UsersDTOResponse.class);
    }
}
