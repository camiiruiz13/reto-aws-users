package com.aws.ccamilo.com.app.retoawsusers.commons.constast;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorException {


    USER_SAVE_ERROR_MESSAGE("Error al guardar el usuario."),
    USER_FETCH_ERROR_MESSAGE("Error al consultar usuario"),
    USER_QUERY_ERROR_MESSAGE("Usuario no encontrado con identificador: ");

    private final String message;

}
