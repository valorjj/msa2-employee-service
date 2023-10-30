package com.example.msa2employeeservice;

import com.example.msa2employeeservice.controller.EmployeeController;
import com.example.msa2employeeservice.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DemoCommandLineRunner implements CommandLineRunner {

    private final EmployeeController controller;

    @Override
    public void run(String... args) throws Exception {
        // save inital data for test purpose
        controller.add(Employee.builder()
            .age(31)
            .id(1L)
            .departmentId(1L)
            .position("newbie")
            .name("jeongin")
            .build()
        );
        controller.add(Employee.builder()
            .age(21)
            .id(2L)
            .departmentId(1L)
            .position("cat")
            .name("bori")
            .build()
        );
        controller.add(Employee.builder()
            .age(22)
            .id(3L)
            .departmentId(2L)
            .position("cat")
            .name("ssar")
            .build()
        );

    }
}
