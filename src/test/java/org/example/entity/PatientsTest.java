package org.example.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PatientsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Patients}
     *   <li>{@link Patients#setAge(String)}
     *   <li>{@link Patients#setAppointment_Date(String)}
     *   <li>{@link Patients#setId(int)}
     *   <li>{@link Patients#setPatient_Name(String)}
     *   <li>{@link Patients#getAge()}
     *   <li>{@link Patients#getAppointment_Date()}
     *   <li>{@link Patients#getId()}
     *   <li>{@link Patients#getPatient_Name()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Patients actualPatients = new Patients();
        actualPatients.setAge("Age");
        actualPatients.setAppointment_Date("2020-03-01");
        actualPatients.setId(1);
        actualPatients.setPatient_Name("Patient Name");
        assertEquals("Age", actualPatients.getAge());
        assertEquals("2020-03-01", actualPatients.getAppointment_Date());
        assertEquals(1, actualPatients.getId());
        assertEquals("Patient Name", actualPatients.getPatient_Name());
    }
}

