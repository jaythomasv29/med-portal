package com.healthportal.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppController {
    @GetMapping("/")
    public ResponseEntity<Object> getIndex() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}