package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "User Rest Controller", description = "REST API for User")
@RequestMapping("/api")
@RestController
public class TestController {
    
    @ApiOperation(value = "Get Users ", response = Iterable.class, tags = "getUsers")
	@RequestMapping(value = "/getUsers")
    public ResponseEntity<String> testSwagger(){
        return new ResponseEntity("response", HttpStatus.OK);
    }

    
}
