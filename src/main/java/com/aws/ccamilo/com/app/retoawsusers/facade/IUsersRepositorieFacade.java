package com.aws.ccamilo.com.app.retoawsusers.facade;

import com.aws.ccamilo.com.app.retoawsusers.domain.model.Users;

public interface IUsersRepositorieFacade {

    Users save(Users users);
    Users findByIdentification(String identificacion);
}
