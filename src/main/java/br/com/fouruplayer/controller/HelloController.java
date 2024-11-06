package br.com.fouruplayer.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<?> get() {
        return new ResponseEntity<>("Hello uhuu", HttpStatusCode.valueOf(200));
    }
}
