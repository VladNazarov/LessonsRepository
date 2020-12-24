package ru.nazarov.vlad.web;

import org.springframework.web.bind.annotation.*;
import ru.nazarov.vlad.web.dto.TestRq;

@RestController
public class ExampleController {

    public ExampleController() {
        System.out.println("Example controller created!");
    }

    @GetMapping(value = "/Example_test")
    public String test(@RequestBody String body, @RequestParam String id, @RequestParam(required = false) String id2) {
        System.out.println("test method fired!");
        return "index";
    }

    @GetMapping("/example/{id}")
    public String example(@PathVariable String id) {
        return "example";
    }
}
