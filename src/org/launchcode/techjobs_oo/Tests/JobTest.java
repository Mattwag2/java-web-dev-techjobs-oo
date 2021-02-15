package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;


import static org.junit.Assert.*;


public class JobTest {

   /* @Before
            public void createTestJob() {

        Job testJob1 = new Job("Tester", new Employer("TEST"), new Location("TESTING LAB"), new PositionType("Tester"), new CoreCompetency("TESTING"));
    };*/

    @Test
        public void testSettingJobId(){
        Job testJob1 = new Job();
        //createTestJob();
        Job testJob2 = new Job();
        assertEquals(1,testJob1.getId(),.001);
        assertEquals(2,testJob2.getId(),.001);
        };

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob1.getName() ==  "Product tester");
        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertTrue(testJob1.getLocation() instanceof Location);
        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
    };

    @Test
    public void testJobsForEquality(){
        Job testJob1 = new Job("Tester", new Employer ("TEST"), new Location ("TESTING LAB"), new PositionType("Tester"), new CoreCompetency("TESTING"));
        Job testJob2 = new Job("Tester", new Employer ("TEST"), new Location ("TESTING LAB"), new PositionType("Tester"), new CoreCompetency("TESTING"));
        assertTrue(testJob1 != testJob2);
    }

    @Test public void testJobsString() {
        Job testJob1 = new Job("Tester", new Employer("TEST"), new Location("TESTING LAB"), new PositionType("Tester"), new CoreCompetency("TESTING"));
        assertTrue(testJob1.toString().isBlank());
    }


    }
