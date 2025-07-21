package com.aws.ccamilo.com.app.retoawsusers.handler;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

import java.io.Serializable;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResponseDTO implements Serializable {
    String error;
    String message;
}
