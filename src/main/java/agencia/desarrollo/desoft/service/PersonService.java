package agencia.desarrollo.desoft.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import agencia.desarrollo.desoft.dao.PersonDao;
import agencia.desarrollo.desoft.model.Person;

@Service
public class PersonService {
	
	private final PersonDao personDao;
	
	@Autowired	
	public PersonService(@Qualifier("mysql") PersonDao personDao) {
		this.personDao = personDao;
	}		
	
	public int addPerson(Person person) {		
		return personDao.InsertPerson(person);
	}
	
	public List<Person> getAllPeople(){
		return personDao.getAll();
	}
	
	public Optional<Person> getPersonById(UUID id) {
		return personDao.selectPersonById(id);
	}
	
	public int deletePerson(UUID id) {
		return personDao.DeletePersonById(id);
	}
	
	public int updatePersonById(UUID id, Person newPerson) {
		return personDao.UpdatePersonById(id, newPerson);		
	}
}
