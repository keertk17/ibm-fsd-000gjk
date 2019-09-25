package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.dto.EmployeeDto;

import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	public EmployeeRepository employeeRepository;
	
	public List<String> search(String keyword) {
		return employeeRepository.search(keyword);
	}
	
	
	@Override
	public EmployeeDto createUser(EmployeeDto eDto) {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Employee emp=mapper.map(eDto,Employee.class);
		employeeRepository.save(emp);
		EmployeeDto eDto1=mapper.map(emp,EmployeeDto.class);
		
		return eDto1;
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 List<Employee> list=new ArrayList<Employee>(); 		  
		  list=employeeRepository.findAll();
		  List<EmployeeDto> list1=new ArrayList<EmployeeDto>();
		  for(Employee e:list)
		  {
			  EmployeeDto e1=mapper.map(e,EmployeeDto.class);
			  list1.add(e1);
		  }
            return list1;
            
            }
	@Override
	public EmployeeDto searchById(int id) {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Optional<Employee> result=employeeRepository.findById(id);
		
		 Employee emp = null;
		if(result.isPresent())
		{
		emp=result.get();
		}
		else
			System.out.println("the invalid id is:"+id);
		
		EmployeeDto eDto=mapper.map(emp,EmployeeDto.class);
		return eDto;
	}
	@Override
	public List<EmployeeDto> searchByName(String name) {
		ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 List<Employee> list=new ArrayList<Employee>(); 		  
		  list=employeeRepository.findByName(name);
		  List<EmployeeDto> list1=new ArrayList<EmployeeDto>();
		  for(Employee e:list)
		  {
			  EmployeeDto e1=mapper.map(e,EmployeeDto.class);
			  list1.add(e1);
		  }
           return list1;
           
	}

	@Override
	public EmployeeDto searchByEmail(String email) {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Optional<Employee> result=employeeRepository.findByEmail(email);
		
		Employee emp=null;
		if(result.isPresent())
		{
		emp=result.get();
		}
		else
			System.out.println("the invalid email is:"+email);
		
		EmployeeDto eDto=mapper.map(emp,EmployeeDto.class);
		return eDto;
	}

	@Override
	public EmployeeDto searchByNumber(String theMobileNumber) {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Optional<Employee> result=employeeRepository.findByMobileNumber(theMobileNumber);
		
		Employee emp=null;
		if(result.isPresent())
		{
		emp=result.get();
		}
		else
			System.out.println("the invalid mobile number is:"+theMobileNumber);
		
		EmployeeDto eDto=mapper.map(emp,EmployeeDto.class);
		return eDto;
	}

	@Override
	public List<EmployeeDto> searchBySkills(String skills) {
		ModelMapper mapper=new ModelMapper();
		 mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 List<Employee> list=new ArrayList<Employee>(); 		  
		  list=employeeRepository.findBySkills(skills);
		  List<EmployeeDto> list1=new ArrayList<EmployeeDto>();
		  for(Employee e:list)
		  {
			  EmployeeDto e1=mapper.map(e,EmployeeDto.class);
			  list1.add(e1);
		  }
          return list1;
	}
	
//	@Override
//	public EmployeeDto deleteById(int id) {
//		Optional<Employee> emp=employeeRepository.findById(id);
//		employeeRepository.deleteById(emp);
//		return emp;
//	}


	@Override
	public EmployeeDto updateEmployee(EmployeeDto empDto, int empId) {
Employee e = null;
		
		Optional<Employee> op = employeeRepository.findById(empId);
		if(op.isPresent()) {
			e = op.get();
			e.setName(empDto.getName());
			e.setEmail(empDto.getEmail());
			e.setMobileNumber(empDto.getMobileNumber());
			employeeRepository.save(e);
		}
			
		ModelMapper mapper1 = new ModelMapper();
		mapper1.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		EmployeeDto dto1 = mapper1.map(e,EmployeeDto.class);
		return dto1;
	}


	@Override
	public EmployeeDto deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	}

