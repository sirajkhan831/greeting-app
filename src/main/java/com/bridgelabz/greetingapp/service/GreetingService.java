package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.GreetingDto;
import com.bridgelabz.greetingapp.entity.GreetingEntity;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepo greetingRepo;

    public List<GreetingDto> getAllGreeting() {
        return greetingRepo
                .findAll()
                .stream()
                .map(greetingEntity -> {
                    GreetingDto greeting = new GreetingDto();
                    greeting.setMessage(greetingEntity.getMessage());
                    return greeting;
                }).collect(Collectors.toList());
    }

    public List<GreetingDto> getMessage(int id) {
        return greetingRepo.findById(id).stream().map(
                greetingEntity -> {
                    GreetingDto greetingDto = new GreetingDto();
                    greetingDto.setMessage(greetingEntity.getMessage());
                    return greetingDto;
                }).collect(Collectors.toList());
    }

    public String addGreeting(GreetingDto greetingDto) {
        GreetingEntity greetingEntity = new GreetingEntity();
        greetingEntity.setMessage(greetingDto.getMessage());
        greetingRepo.save(greetingEntity);
        return "Message added successfully";
    }
}
