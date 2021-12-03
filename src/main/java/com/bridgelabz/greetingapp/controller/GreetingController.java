package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.dto.GreetingDto;
import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/get-all-greeting")
    public List<GreetingDto> getAllGreetings() {
        return greetingService.getAllGreeting();
    }

    @PostMapping(value = {"add-greeting"})
    public String addGreeting(
            @RequestBody GreetingDto greetingDto
    ) {
        return greetingService.addGreeting(greetingDto);
    }
}
