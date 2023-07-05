/**
 * Created By Krishna Shinde
 * Date : 05-07-2023
 * Time : 19:04
 * Project: OneToManyHibernateApplicationWithSaveAndFetch
 **/

package org.example.test;

import org.example.entity.Doctor;
import org.example.entity.Patients;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;

public class OneToManyHibernateApplicationWithSave {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();


        Patients patients=new Patients();
        patients.setPatient_Name("Ajay DholePatil");
        patients.setAge("24");
        patients.setAppointment_Date("05/07/2023");

        Patients patients1=new Patients();
        patients1.setPatient_Name("Vijay Kumar");
        patients1.setAge("22");
        patients1.setAppointment_Date("03/07/2023");

        Patients patients2=new Patients();
        patients2.setPatient_Name("Omkar Shirke");
        patients2.setAge("22");
        patients2.setAppointment_Date("05/07/2023");

        Doctor doctor=new Doctor();
        doctor.setDoctor_Name("Krishna shinde");
        doctor.setOpd_Date("23/04/2023");
        doctor.setOpd_Time("12:00 PM");

        List<Patients> list=new ArrayList<>();
        list.add(patients);
        list.add(patients1);
        list.add(patients2);

        doctor.setPatients(list);

        session.persist(doctor);


        transaction.commit();
        session.close();

        System.out.println("Data has been Successfully");
    }
}


