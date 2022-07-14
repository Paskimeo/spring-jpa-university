package jana60.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.modello.Università;

@Repository
public interface UniversityRepository extends CrudRepository <Università, Integer> {

	

	
}