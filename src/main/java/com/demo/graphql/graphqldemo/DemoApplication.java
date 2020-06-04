package com.demo.graphql.graphqldemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	public CommandLineRunner loadData(EmployeeRepository employeeRepository,AddressRepository addressRepository) {
		return (args)->{
			Address address = new Address();
			address.setApartmentNo(48);
			address.setCity("Bangalore");
			address.setPostalCode("67123");
			address.setStreet("HSR");
			addressRepository.save(address);
	
			Employee employee = new Employee();
			employee.setEmpId(4562L);
			employee.setFirstName("Sonia");
			employee.setLastName("Anand");
			employee.setAddress(address);
			employeeRepository.save(employee);
		};	

	}

}
