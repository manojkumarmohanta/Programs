package com.project.demoemsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demoemsbackend.entity.Employee;

@Repository
public interface EmployeeRrepository extends JpaRepository <Employee, Long>{

}
