package com.example.starter.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.starter.service.StarterService;

import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/test")
public class StarterController {
    
    @Autowired
    private StarterService starterService;

    @GetMapping("")
    public ResponseEntity<String> test1() {
        return ResponseEntity.status(HttpStatus.OK).body("Hi spring boot");
    }


    @GetMapping("/test2")
    public ResponseEntity<String> test2(@RequestParam("test2") String param) {
        return ResponseEntity.status(HttpStatus.OK).body("Hi spring boot" + param);
    }
    

    @PostMapping("/test3")
    public ResponseEntity<Object> test3(@RequestBody Map<String, String> entity) {
       
        return ResponseEntity.status(HttpStatus.OK).body(entity.get("id"));
    }


    @GetMapping("/test4")
    public ResponseEntity<String> test4(@RequestParam("test2") int param) {

        String numberStr = this.starterService.forNumber(param);

        return ResponseEntity.status(HttpStatus.OK).body(numberStr);
    }

    @GetMapping("/test5")
    public ResponseEntity<String> test5(@RequestParam("test2") int param) {

        String numberStr = this.starterService.ifNumber(param);

        return ResponseEntity.status(HttpStatus.OK).body(numberStr);
    }

    @GetMapping("/test6")
    public ResponseEntity<String> test6(@RequestParam("test2") int param) {

        String numberStr = this.starterService.mainMethod(param);

        return ResponseEntity.status(HttpStatus.OK).body(numberStr);
    }
    
    @GetMapping("/test7")
    public ResponseEntity<String> test7(@RequestParam("test2") int param) {

        String numberStr = this.starterService.mainMethod(param);

        return ResponseEntity.status(HttpStatus.OK).body(numberStr);
    }
}
