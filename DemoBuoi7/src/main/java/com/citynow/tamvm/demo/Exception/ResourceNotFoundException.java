package com.citynow.tamvm.demo.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(Http.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }
    public ResourceNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
