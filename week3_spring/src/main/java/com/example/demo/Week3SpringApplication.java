package com.example.demo;

import com.example.data.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Week3SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week3SpringApplication.class, args);
	}

	@GetMapping(path = "/employee", produces = "application/json")
	public Employee getEmployee(@RequestParam(value = "last- name", defaultValue = "Ji") String lastName) {
		Employee employee = new Employee();
		employee.setFirstName("Qiao");
		employee.setLastName(lastName);
		return employee;
	}

}
