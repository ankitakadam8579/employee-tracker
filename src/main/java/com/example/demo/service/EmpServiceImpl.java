package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Emplyoee;
import com.example.demo.repositary.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpRepository empRepositary;

    @Override
    public List<Emplyoee> getAllEmplyoee() {
        return empRepositary.findAll();
    }

    @Override
    public Emplyoee getEmplyoeeById(int id) {
        Optional<Emplyoee> emp = empRepositary.findById(id);
        return emp.orElse(null);
    }

    @Override
    public Emplyoee addEmplyoee(Emplyoee emplyoee) {
        return empRepositary.save(emplyoee);
    }

    @Override
    public Emplyoee upadateEmplyoeeById(Emplyoee emplyoee, int id) {
        Optional<Emplyoee> optional = empRepositary.findById(id);
        if (optional.isPresent()) {
            Emplyoee existing = optional.get();
            existing.setEmpName(emplyoee.getEmpName());
            existing.setEmpDept(emplyoee.getEmpDept());
            existing.setEmpSal(emplyoee.getEmpSal());
            return empRepositary.save(existing);
        } else {
            return null;
        }
    }

    @Override
    public void deleteEmplyoee(int id) {
        empRepositary.deleteById(id);
    }
}
