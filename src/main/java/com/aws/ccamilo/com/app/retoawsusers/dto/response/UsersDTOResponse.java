package com.aws.ccamilo.com.app.retoawsusers.dto.response;

import com.aws.ccamilo.com.app.retoawsusers.commons.annotations.FieldMapping;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.aws.ccamilo.com.app.retoawsusers.domain.model.Users}
 */
@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersDTOResponse implements Serializable {

    @FieldMapping("id")
    Long idUsers;
    String identificacion;
    String nombre;
    String email;
}