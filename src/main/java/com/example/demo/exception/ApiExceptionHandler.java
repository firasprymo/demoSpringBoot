package com.example.demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;
import java.util.logging.Logger;

@ControllerAdvice
@Slf4j
public class ApiExceptionHandler {


//    @ExceptionHandler(value = ApiRequestException.class)
//    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){
//ApiException apiException=new ApiException(
//        e.getMessage(),
//        e,
//        HttpStatus.BAD_REQUEST,
//        ZonedDateTime.now()
//)
//    }
}
