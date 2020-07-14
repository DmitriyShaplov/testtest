package com.example.cafe.dto.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (value = HttpStatus.NOT_FOUND)
public class NotFoundExcept extends RuntimeException {
}
