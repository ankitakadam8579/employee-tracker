package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Emplyoee;
import com.example.demo.service.EmpService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/emp")
public class EmplyoeeController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public List<Emplyoee> getAllEmp() {
        return empService.getAllEmplyoee();
    }

    @PostMapping
    public Emplyoee addEmp(@RequestBody Emplyoee employee) {
        return empService.addEmplyoee(employee);
    }

    @PutMapping("/{id}")
    public Emplyoee updateEmp(@RequestBody Emplyoee employee, @PathVariable("id") int id) {
        return empService.upadateEmplyoeeById(employee, id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmp(@PathVariable("id") int id) {
        empService.deleteEmplyoee(id);
    }
}
