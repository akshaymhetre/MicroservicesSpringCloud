package com.akshay.learning.microservices.employee.create.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class CreateController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String create() {
        return "Created";
    }
}
