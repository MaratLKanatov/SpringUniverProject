package com.example.spring_univer_project.model.entities;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
public class Patient {

    private Long id;

    private String firstname;

    private String lastname;

    private String gender;

    private Timestamp birthdate;

    private String location;

    private String telnum;

    public Patient() {

    }

    public Patient(Long id, String firstname, String lastname, String gender, Timestamp birthdate, String location, String telnum) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.location = location;
        this.telnum = telnum;
    }

    @Override
    public String toString() {
        return "Patient{" +
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
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) && Objects.equals(firstname, patient.firstname) && Objects.equals(lastname, patient.lastname) && Objects.equals(gender, patient.gender) && Objects.equals(birthdate, patient.birthdate) && Objects.equals(location, patient.location) && Objects.equals(telnum, patient.telnum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, gender, birthdate, location, telnum);
    }
}
