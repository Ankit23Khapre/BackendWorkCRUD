package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Admission;

public interface UserRepository extends JpaRepository<Admission, Integer>{

}
