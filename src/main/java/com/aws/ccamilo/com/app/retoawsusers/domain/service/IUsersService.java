package com.aws.ccamilo.com.app.retoawsusers.domain.service;

import com.aws.ccamilo.com.app.retoawsusers.dto.request.UsersDTORequest;
import com.aws.ccamilo.com.app.retoawsusers.dto.response.UsersDTOResponse;

public interface IUsersService {
    void  saveUser(UsersDTORequest usersDTORequest);
    UsersDTOResponse findByIdentifier(String identifier);
}
