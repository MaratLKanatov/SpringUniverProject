package com.example.spring_univer_project.model.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
public class Doctor {
    private Long id;

    private String firstname;

    private String lastname;

    private String gender;

    private Date birthdate;

    private String location;

    private String telnum;

    public Doctor(Long id, String firstname, String lastname, String gender, Date birthdate, String location, String telnum) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.location = location;
        this.telnum = telnum;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                ", location='" + location + '\'' +
                ", telnum='" + telnum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(id, doctor.id) && Objects.equals(firstname, doctor.firstname) && Objects.equals(lastname, doctor.lastname) && Objects.equals(gender, doctor.gender) && Objects.equals(birthdate, doctor.birthdate) && Objects.equals(location, doctor.location) && Objects.equals(telnum, doctor.telnum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, gender, birthdate, location, telnum);
    }
}
