package com.example.simo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/simo/")
public interface SimoControllerInterface {

    @PostMapping("test")
    ResponseEntity<String> test();

    @GetMapping("test-get-variable/{var1}/{var2}")
    ResponseEntity<String> testGetVariable(@PathVariable("var1") String var1, @PathVariable("var2") String var2);

    @GetMapping("test-get-param")
    ResponseEntity<String> testGetParam(@RequestParam("var1") String var1, @RequestParam("var2") String var2);
}
