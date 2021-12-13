package com.can.springbootslf4jlogback;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

@Slf4j
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);

        log.debug("Hello from Logback {}", data);
        log.debug("Hello from Logback");
        log.info("Test");
        return "Merhaba dünya";

    }

    @GetMapping("/getError")
    public void getError() {
        try {
            System.out.println(getData());
        } catch (IllegalArgumentException e) {
            log.error("{}", e);
        }

    }


    static int getData() throws IllegalArgumentException {
        throw new IllegalArgumentException("Sorry IllegalArgumentException!");
    }
}


