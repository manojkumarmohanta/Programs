package com.project.demoemsbackend.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.demoemsbackend.dto.EmployeeDto;
import com.project.demoemsbackend.entity.Employee;
import com.project.demoemsbackend.exception.ResourceNotFoundException;
import com.project.demoemsbackend.mapper.EmployeeMapper;
import com.project.demoemsbackend.repository.EmployeeRrepository;
import com.project.demoemsbackend.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	

	public EmployeeServiceImpl(EmployeeRrepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	private EmployeeRrepository employeeRepository; 
	
	@SuppressWarnings("null")
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	@SuppressWarnings("null")
	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.findById(employeeId)
		.orElseThrow(() -> new ResourceNotFoundException("Employee Does Not Exist With Given Id" + employeeId) );
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employees = employeeRepository.findAll();
		return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
	}

	@SuppressWarnings("null")
	@Override
	public EmployeeDto updatedEmployee(Long employeeId, EmployeeDto updatedEmployee) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(
				() -> new ResourceNotFoundException("Employee Not Exist With Given Id"+ employeeId)
				);
		employee.setFirstName(updatedEmployee.getFirstName());
		employee.setLastName(updatedEmployee.getLastName());
		employee.setEmail(updatedEmployee.getEmail());
		
		Employee updatedEmployeeObj = employeeRepository.save(employee);
		
		return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
	}

	@SuppressWarnings("null")
	@Override
	public void deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		employeeRepository.findById(employeeId).orElseThrow(
				() -> new ResourceNotFoundException("Employee Not Exist With Given Id"+ employeeId)
				);
		employeeRepository.deleteById(employeeId);
	}

	
}
