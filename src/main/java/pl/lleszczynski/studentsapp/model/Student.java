package pl.lleszczynski.studentsapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String postalCode;
    private String year;
    private String departments;

    public Student(int id, String robert, String wójcikiewicz, String email, String address_example, String postalCode, String math) {
    }
}
