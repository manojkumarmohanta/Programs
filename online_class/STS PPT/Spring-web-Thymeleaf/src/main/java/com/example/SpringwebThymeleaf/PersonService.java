package com.example.SpringwebThymeleaf;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
	private PersonRepository repository;
	
	public PersonService(PersonRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Person(101,"Rahul","rahul@gamil.com"));
		repository.save(new Person(102,"balaram","balaram@gamil.com"));
		repository.save(new Person(103,"jena","jena@gamil.com"));
	}
	
	public List<Person> retriveAllPerson(){
		return repository.findAll();
	}
	public Person retreivePersonById(int id) {
		
		return repository.findById(id).get();
	}
	public void storePerson(Person person) {
		repository.save(person);
	}
	public void deletePersonByid(int id) {
		repository.deleteById(id);
	}
}
