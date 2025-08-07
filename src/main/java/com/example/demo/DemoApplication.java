package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Emplyoee;
import com.example.demo.service.EmpService;
import com.example.demo.service.EmpServiceImpl;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        EmpService empservice = context.getBean(EmpService.class);


        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        String dept;
        float salary;
        int ch, c;

        do {
            System.out.println("\n===== Employee Management Menu =====");
            System.out.println("1. Insert Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Employee ID:");
                    id = sc.nextInt();
                    System.out.println("Enter Name:");
                    name = sc.next();
                    System.out.println("Enter Department:");
                    dept = sc.next();
                    System.out.println("Enter Salary:");
                    salary = sc.nextFloat();

                    Emplyoee newEmp = new Emplyoee(id, name, dept, salary);
                    empservice.addEmplyoee(newEmp);
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.println("Enter Employee ID to delete:");
                    id = sc.nextInt();
                    empservice.deleteEmplyoee(id);
                    System.out.println("Employee deleted successfully.");
                    break;

                case 3:
                    System.out.println("Enter existing Employee ID to update:");
                    id = sc.nextInt();

                    Emplyoee existing = empservice.getEmplyoeeById(id);
                    if (existing != null) {
                        System.out.println("Enter new Name:");
                        name = sc.next();
                        System.out.println("Enter new Department:");
                        dept = sc.next();
                        System.out.println("Enter new Salary:");
                        salary = sc.nextFloat();

                        Emplyoee updatedEmp = new Emplyoee(id, name, dept, salary);
                        empservice.upadateEmplyoeeById(updatedEmp, id);
                        System.out.println("Employee updated successfully.");
                    } else {
                        System.out.println("Employee with ID " + id + " not found.");
                    }
                    break;

                case 4:
                    List<Emplyoee> list = empservice.getAllEmplyoee();
                    if (list.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("\n--- Employee List ---");
                        for (Emplyoee emp : list) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting the application.");
                    context.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("\nDo you want to continue? Press 1 to continue or 5 to exit: ");
            c = sc.nextInt();
        } while (c == 1);

        sc.close();
        context.close();
    }
}
