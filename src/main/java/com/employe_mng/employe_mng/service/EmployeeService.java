package com.employe_mng.employe_mng.service;

import com.employe_mng.employe_mng.model.Employee;
import com.employe_mng.employe_mng.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployeeService {
        @Autowired
        EmployeeRepository employeeRepository;

        public ArrayList<Employee> getAllEmployees() {
           return (ArrayList<Employee>)employeeRepository.findAll();

        }

        public Employee getEmployeeById(Long id) {

                Optional<Employee> optional = employeeRepository.findById(id);
                Employee employee = null;
                if (optional.isPresent()) {
                        employee = optional.get();
                } else {
                        throw new RuntimeException("Employee not found by id: " + id);
                }
                return employee;
        }

        public Employee saveEmployee(Employee employee) {
                Optional<Employee> employee1=
                        employeeRepository.findEmployeeByEmail(employee.getEmail());

                if(employee1.isPresent()) {
                        throw new IllegalStateException("Student email already");

                }


                return employeeRepository.save(employee);
        }
        public void deleteEmployeeById(Long id) {
                Optional<Employee> employee1=
                        employeeRepository.findEmployeeById(id);

                if(employee1.isPresent()) {
                        this.employeeRepository.deleteById(id);

                }else{
                        throw new IllegalStateException("Student doesnt exist");

                }

        }







}
