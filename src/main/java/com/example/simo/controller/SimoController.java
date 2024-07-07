package com.example.simo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class SimoController implements SimoControllerInterface {
    public ResponseEntity<String> test(){
        log.info("test endpoint");
        return new ResponseEntity<>("asd", HttpStatus.ACCEPTED);
    }

    public ResponseEntity<String> testGetVariable(@PathVariable("var1") String var1, @PathVariable("var2") String var2) {
        log.info("testGetVariable endpoint with var1: {} and var2: {}", var1, var2);
        return new ResponseEntity<>(var1 + " " + var2, HttpStatus.OK);
    }

    public ResponseEntity<String> testGetParam(@RequestParam("var1") String var1, @RequestParam("var2") String var2){
        log.info("testGetParam endpoint with var1: {} and var2: {}", var1, var2);
        return new ResponseEntity<>(var1 + " " + var2, HttpStatus.OK);
    }
}
