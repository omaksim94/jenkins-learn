package org.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class Controller {

    @GetMapping
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return Objects.nonNull(name)
                ? "Hello, " + name + "!"
                : "Hello, World!";
    }
}
