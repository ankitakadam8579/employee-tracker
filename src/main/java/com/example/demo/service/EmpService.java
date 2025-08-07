package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Emplyoee;

public interface EmpService {
    List<Emplyoee> getAllEmplyoee();
    Emplyoee getEmplyoeeById(int id);
    Emplyoee addEmplyoee(Emplyoee emplyoee);
    Emplyoee upadateEmplyoeeById(Emplyoee emplyoee, int id);
    void deleteEmplyoee(int id);
}
