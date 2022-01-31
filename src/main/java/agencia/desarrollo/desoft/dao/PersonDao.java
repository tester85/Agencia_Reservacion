package agencia.desarrollo.desoft.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import agencia.desarrollo.desoft.model.Person;

public interface PersonDao {
	
	int InsertPerson(UUID id, Person person	);
	
	default int InsertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return InsertPerson(id, person);
	};
	
	List<Person> getAll();	
	
	Optional<Person> selectPersonById(UUID id);
	
	int DeletePersonById(UUID id);
	
	int UpdatePersonById(UUID id, Person person);
	
}
