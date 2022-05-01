package com.spring.properties.democonfigurationprop.controller;

import com.spring.properties.democonfigurationprop.data.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InformationController {
    @Autowired
    private Database database;

    @Autowired
    private Environment environment;

    @GetMapping("/info")
    public Database getDatabaseInformation(){
        database.setEnvironment(environment.getProperty("app.env"));
        return database;
    }
}
