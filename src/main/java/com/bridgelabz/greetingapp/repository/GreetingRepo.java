package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.entity.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GreetingRepo extends JpaRepository<GreetingEntity, Integer> {
}
