package jana60.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.modello.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}