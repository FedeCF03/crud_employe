package com.employe_mng.employe_mng.repository;

import com.employe_mng.employe_mng.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    Optional<Employee> findEmployeeByEmail(String email);
    Optional<Employee> findEmployeeById(Long id);



}
