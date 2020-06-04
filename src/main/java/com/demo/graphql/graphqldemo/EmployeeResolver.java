package com.demo.graphql.graphqldemo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class EmployeeResolver implements GraphQLResolver<Employee>{

    @Autowired
    private AddressRepository addressRepository;

    public Optional<Address> address(Employee employee){
        return this.addressRepository.findById(employee.getAddress().getId());

    }
    
}