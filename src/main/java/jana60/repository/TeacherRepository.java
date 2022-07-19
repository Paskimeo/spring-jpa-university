package jana60.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.modello.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository <Teacher, Integer> {
	
}