package jana60.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.modello.Degree;



@Repository
public interface DegreeRepository extends CrudRepository <Degree, Integer> {

}
