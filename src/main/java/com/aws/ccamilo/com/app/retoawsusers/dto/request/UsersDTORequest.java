package com.aws.ccamilo.com.app.retoawsusers.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.aws.ccamilo.com.app.retoawsusers.domain.model.Users}
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersDTORequest implements Serializable {
    String identificacion;
    String nombre;
    String email;
}