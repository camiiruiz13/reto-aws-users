package com.aws.ccamilo.com.app.retoawsusers.handler;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

import java.io.Serializable;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuccesResponseDTO implements Serializable {

    String message;
    Object data;
}
