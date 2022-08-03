package com.employe_mng.employe_mng.controller;

import com.employe_mng.employe_mng.model.Employee;
import com.employe_mng.employe_mng.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {
    private final EmployeeService employeeService;
@Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();

}

@GetMapping("/{id}")
public Employee getEmployeeById(@PathVariable(value = "id") Long id){

return  employeeService.getEmployeeById(id);

}

@PostMapping("/save")
public Employee saveemployee
        (@RequestBody Employee employee ) {
     return this.employeeService.saveEmployee(employee);
}
    @GetMapping("/delete/{id}")
        public String deleteEmployee (@PathVariable(value = "id") Long id){

          employeeService.deleteEmployeeById(id);
    return "redirect:/";

    }

    



}
