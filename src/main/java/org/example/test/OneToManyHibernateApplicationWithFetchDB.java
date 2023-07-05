/**
 * Created By Krishna Shinde
 * Date : 05-07-2023
 * Time : 19:55
 * Project: OneToManyHibernateApplicationWithSaveAndFetch
 **/

package org.example.test;

import jakarta.persistence.TypedQuery;
import org.example.entity.Doctor;
import org.example.entity.Patients;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Iterator;
import java.util.List;

public class OneToManyHibernateApplicationWithFetchDB {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().
                configure("hibernate.cfg.xml").build();
        Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        TypedQuery typedQuery=session.createQuery("from Doctor doctor");
        List<Doctor> list=typedQuery.getResultList();
        Iterator<Doctor> iterator= list.listIterator();
        while (iterator.hasNext()){
            Doctor doctor=iterator.next();
            System.out.println("********************Doctor Info********************"+doctor.getDoctor_Name()+
                    " "+doctor.getOpd_Date()+"  "+doctor.getOpd_Time());
            List<Patients> list1=doctor.getPatients();
            Iterator<Patients> iterator1=list1.iterator();
            while (iterator1.hasNext()){
                Patients patients=iterator1.next();
                System.out.println("*******************Patient Info******************"+patients.getPatient_Name()
                +"  "+patients.getAppointment_Date()+"  "+patients.getAge());
            }
        }
        session.close();
        System.out.println("Data has been successfully Retrived");
    }
}


