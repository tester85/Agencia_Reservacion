package agencia.desarrollo.desoft.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import agencia.desarrollo.desoft.model.Person;

@Repository("mysql")
public class PersonDataAccessService implements PersonDao {

	@Override
	public int InsertPerson(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Person> getAll() {
		List<Person> l = new ArrayList<Person>();
		for(int i=0; i< 5; i++) {
			l.add(new Person(UUID.randomUUID(),"From postgres Db", "email", true));
		}
		return l; 
	}

	@Override
	public Optional<Person> selectPersonById(UUID id) {
		return Optional.empty();
	}

	@Override
	public int DeletePersonById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdatePersonById(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

}
