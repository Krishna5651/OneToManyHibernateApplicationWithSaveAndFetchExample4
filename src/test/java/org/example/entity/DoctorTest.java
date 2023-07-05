package org.example.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DoctorTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Doctor}
     *   <li>{@link Doctor#setDoctor_Name(String)}
     *   <li>{@link Doctor#setId(int)}
     *   <li>{@link Doctor#setOpd_Date(String)}
     *   <li>{@link Doctor#setOpd_Time(String)}
     *   <li>{@link Doctor#setPatients(List)}
     *   <li>{@link Doctor#getDoctor_Name()}
     *   <li>{@link Doctor#getId()}
     *   <li>{@link Doctor#getOpd_Date()}
     *   <li>{@link Doctor#getOpd_Time()}
     *   <li>{@link Doctor#getPatients()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Doctor actualDoctor = new Doctor();
        actualDoctor.setDoctor_Name("Doctor Name");
        actualDoctor.setId(1);
        actualDoctor.setOpd_Date("2020-03-01");
        actualDoctor.setOpd_Time("Opd Time");
        ArrayList<Patients> patients = new ArrayList<>();
        actualDoctor.setPatients(patients);
        assertEquals("Doctor Name", actualDoctor.getDoctor_Name());
        assertEquals(1, actualDoctor.getId());
        assertEquals("2020-03-01", actualDoctor.getOpd_Date());
        assertEquals("Opd Time", actualDoctor.getOpd_Time());
        assertSame(patients, actualDoctor.getPatients());
    }
}

