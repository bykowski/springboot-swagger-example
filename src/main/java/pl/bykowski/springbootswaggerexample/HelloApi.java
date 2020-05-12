package pl.bykowski.springbootswaggerexample;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloApi {

    @GetMapping
    public String get() {
        return "test";
    }
}


