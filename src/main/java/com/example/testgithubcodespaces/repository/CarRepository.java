package com.example.testgithubcodespaces.repository;

import com.example.testgithubcodespaces.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}