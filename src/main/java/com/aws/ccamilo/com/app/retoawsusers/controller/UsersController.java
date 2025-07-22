package com.aws.ccamilo.com.app.retoawsusers.controller;

import com.aws.ccamilo.com.app.retoawsusers.commons.constast.EndPointApi;
import com.aws.ccamilo.com.app.retoawsusers.commons.constast.ErrorException;
import com.aws.ccamilo.com.app.retoawsusers.domain.service.IUsersService;
import com.aws.ccamilo.com.app.retoawsusers.dto.request.UsersDTORequest;
import com.aws.ccamilo.com.app.retoawsusers.handler.SuccesResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(EndPointApi.BASE_PATH)
@RequiredArgsConstructor
@Slf4j
public class UsersController {

    private final IUsersService usersService;

    @PostMapping
    public ResponseEntity<SuccesResponseDTO> save(@RequestBody UsersDTORequest request) {
        log.info("Ingreso al servicio de guardar users");
        usersService.saveUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(new SuccesResponseDTO(ErrorException.USER_REGISTERED_SUCCESS_MESSAGE.getMessage(), null));
    }

    @GetMapping(EndPointApi.GET_USERS)
    public ResponseEntity<SuccesResponseDTO> findByIdentity(@PathVariable String identity) {
        log.info("Ingreso al servicio de filtrar por identities", identity);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccesResponseDTO(ErrorException.USER_QUERY_SUCCESS_MESSAGE.getMessage(), usersService.findByIdentifier(identity)));
    }
}
