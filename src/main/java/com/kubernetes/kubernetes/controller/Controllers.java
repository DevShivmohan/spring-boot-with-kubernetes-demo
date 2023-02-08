package com.kubernetes.kubernetes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kubectl")
public class Controllers {

    @GetMapping("/test")
    public ResponseEntity<?> getInformationMessage(){
        return ResponseEntity.status(HttpStatus.OK).body("Welcome in kubernetes learning.....");
    }
}
