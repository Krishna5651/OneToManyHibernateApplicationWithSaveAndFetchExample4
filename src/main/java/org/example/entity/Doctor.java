/**
 * Created By Krishna Shinde
 * Date : 05-07-2023
 * Time : 19:04
 * Project: OneToManyHibernateApplicationWithSaveAndFetch
 **/

package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String doctor_Name;
    private String opd_Time;
    private String opd_Date;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pid")
    @OrderColumn(name = "type")
    private List<Patients> patients;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        this.doctor_Name = doctor_Name;
    }

    public String getOpd_Time() {
        return opd_Time;
    }

    public void setOpd_Time(String opd_Time) {
        this.opd_Time = opd_Time;
    }

    public String getOpd_Date() {
        return opd_Date;
    }

    public void setOpd_Date(String opd_Date) {
        this.opd_Date = opd_Date;
    }

    public List<Patients> getPatients() {
        return patients;
    }

    public void setPatients(List<Patients> patients) {
        this.patients = patients;
    }
}


