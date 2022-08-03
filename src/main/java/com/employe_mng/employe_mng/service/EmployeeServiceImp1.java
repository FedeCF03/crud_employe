package com.employe_mng.employe_mng.service;

import com.employe_mng.employe_mng.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeServiceImp1 {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
