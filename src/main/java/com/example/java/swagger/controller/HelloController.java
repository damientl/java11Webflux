package com.example.java.swagger.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


//http://localhost:8080/v2/api-docs

@RestController
@RequestMapping("example")
public class HelloController {


  @GetMapping
  @ApiOperation(value = "Save a quote", response = String.class)
  @ApiResponses(value = {@ApiResponse(code = 201, message = "Created."),
      @ApiResponse(code = 401, message = "Request validation failed."),
      @ApiResponse(code = 500, message = "Internal server error.")})
  @RequestMapping(value = "/a", method = RequestMethod.GET)
  public Mono<String> getListUrls() {
    return Mono.fromSupplier(() -> "hello");
  }

}
