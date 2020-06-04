package com.demo.graphql.graphqldemo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class EmployeeQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> searchEmployee(Long id) {
        return this.employeeRepository.findById(id);

    }

    public Iterable<Employee> findAllEmployees() {
        return this.employeeRepository.findAll();
    }

}