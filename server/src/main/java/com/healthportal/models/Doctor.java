package com.healthportal.models;

import javax.print.Doc;
import java.util.List;
import java.util.Objects;


public class Doctor {
    // fields go here
    private long id;
    private String firstName;
    private String lastName;
    private String doctor_id;
    private List<Patient> patientList;

    public Doctor(){}

    public Doctor(String firstName, String lastName,
                  String doctor_id, List<Patient> patientList){
        this.firstName = firstName;
        this.lastName = lastName;
        this.doctor_id = doctor_id;
        this.patientList = patientList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", doctor_id='" + doctor_id + '\'' +
                ", patientList=" + patientList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id && firstName.equals(doctor.firstName) && lastName.equals(doctor.lastName) && doctor_id.equals(doctor.doctor_id) && patientList.equals(doctor.patientList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, doctor_id, patientList);
    }
}
