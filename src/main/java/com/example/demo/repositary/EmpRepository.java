package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Emplyoee;

@Repository
public interface EmpRepository extends JpaRepository<Emplyoee, Integer> {
}
