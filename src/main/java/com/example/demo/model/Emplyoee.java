package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Details")
public class Emplyoee {

    @Id
    private int empId;
    private String empName;
    private String empDept;
    private float empSal;

    public Emplyoee() {
    }

    public Emplyoee(int empId, String empName, String empDept, float empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public float getEmpSal() {
        return empSal;
    }

    public void setEmpSal(float empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Emplyoee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSal=" + empSal + "]";
    }
}
