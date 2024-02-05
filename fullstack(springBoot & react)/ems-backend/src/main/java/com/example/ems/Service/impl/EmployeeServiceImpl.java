package com.example.ems.Service.impl;

import org.springframework.stereotype.Service;

import com.example.ems.Entity.Employee;
import com.example.ems.Mapper.EmployeeMapper;
import com.example.ems.Repository.EmployeeRepository;
import com.example.ems.Service.EmployeeService;
import com.example.ems.dto.EmployeeDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

}
