package agencia.desarrollo.desoft.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import agencia.desarrollo.desoft.model.Person;

@Repository("fakeRepo")
public class FakePersonDataAccess implements PersonDao{ 
	
	private static List<Person> DB = new ArrayList<>();
	
	@Override
	public int InsertPerson(UUID id, Person person) {
			DB.add(new Person(id, person.getName()));
			return 1;
	}

	@Override
	public List<Person> getAll() {		
		return DB;
	}

	@Override
	public Optional<Person> selectPersonById(UUID id) {
		return DB.stream()
				.filter(person-> person.getId().equals(id))
				.findFirst();
	}

	@Override
	public int DeletePersonById(UUID id) {
		Optional<Person> personRequested = selectPersonById(id);
		if(personRequested.isEmpty()) {
			return 0;
		}
		DB.remove(personRequested.get());
		return 1;
	}

	@Override
	public int UpdatePersonById(UUID id, Person update) {
		// TODO Auto-generated method stub
		return selectPersonById(id).map(person -> {
					int indexOfPersonToUpdate = DB.indexOf(person);
					if(indexOfPersonToUpdate>=0) {
						DB.set(indexOfPersonToUpdate, new Person(id,update.getName()));
						return 1;
					}
					return 0;
				})
				.orElse(0);
	}	

}
