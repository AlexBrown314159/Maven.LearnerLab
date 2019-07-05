package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    public TestStudents() {

    }

    @Test
    public void TestStudents1() {

        Students testStudents = Students.getInstance();

            Long expected = 1008L;

            Long actual = testStudents.personList.get(7).getId();

            Assert.assertEquals(expected, actual);

    }


    @Test
    public void TestStudents2() {

        Students testStudents = Students.getInstance();

//        Student Caleb = new Student(1008L, "Caleb");

        String expected = "Caleb";

        String actual = testStudents.personList.get(7).getName();

        Assert.assertEquals(expected, actual);

    }





}

//### Part 7.0 - Test `Students` singleton
//        * Create a `TestStudents` class.
//        * Create a `test` method which ensures that each of the students in your current cohort
//        are in your `Students` singleton.