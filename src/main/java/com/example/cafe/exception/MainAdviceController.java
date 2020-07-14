package com.example.cafe.exception;

import com.example.cafe.dto.exeptions.NotFoundExcept;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MainAdviceController {

    @ExceptionHandler(NotFoundExcept.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String notFoundException() {
        return "NOT FOUND";
    }
}
