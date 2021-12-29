package com.spring.springdocker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/print")
    public ResponseEntity<String> print()
    {
        return ResponseEntity.ok("Hello Docker!!");
    }
}
