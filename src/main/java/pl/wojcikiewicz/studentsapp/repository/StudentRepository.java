package pl.wojcikiewicz.studentsapp.repository;

import org.springframework.stereotype.Component;
import pl.wojcikiewicz.studentsapp.model.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public List<Student> findAll() {
        Student student = new Student(
                1,
                "Robert",
                "Wójcikiewicz",
                "wojcikiewicz.robert@gmail.com",
                "Address example", "00-000",
                "2000","FINANCE");

        students.add(student);

        return students;
    }

    public Student findByEmail(String email) {
        Student student = new Student(
                1,
                "Robert",
                "Wójcikiewicz",
                "wojcikiewicz.robert@gmail.com",
                "Address example", "00-000","2000","MATH");

        return student;
    }

    public Student findById(Integer id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


    public Student findByDepartment(String department) {
        return students.stream()
                .filter(student -> student.getDepartments ().equals(department))
                .findFirst()
                .orElse(null);
    }

    public Student add(Student student) {
        Integer newStudentId = students.size() + 1;
        student.setId(newStudentId);
        students.add(student);

        return student;
    }
}
