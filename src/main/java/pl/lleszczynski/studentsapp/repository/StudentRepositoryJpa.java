package pl.lleszczynski.studentsapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.lleszczynski.studentsapp.model.Student;

public interface StudentRepositoryJpa extends CrudRepository<Student, Integer> {

    Student findByEmail(String email);
}
