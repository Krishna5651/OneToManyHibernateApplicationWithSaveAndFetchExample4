/**
 * Created By Krishna Shinde
 * Date : 05-07-2023
 * Time : 19:05
 * Project: OneToManyHibernateApplicationWithSaveAndFetch
 **/

package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String patient_Name;
    private String age;
    private String appointment_Date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatient_Name() {
        return patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        this.patient_Name = patient_Name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAppointment_Date() {
        return appointment_Date;
    }

    public void setAppointment_Date(String appointment_Date) {
        this.appointment_Date = appointment_Date;
    }
}


