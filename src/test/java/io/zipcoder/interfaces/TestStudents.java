package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    public TestStudents() {

    }

    @Test
    public void TestCount() {

        Students students = new Students();

        students = Students.getInstance();
        System.out.println(students.count());

        for (Long i = 1001L; i <+ 1029L; i++) {

            Person newStudent = students.findById(i);
            System.out.println("***" + newStudent.getName() + "***");

            Long expected = i;

            Long actual = newStudent.getId();

            Assert.assertEquals(expected, actual);

        }

    }

}

//### Part 7.0 - Test `Students` singleton
//        * Create a `TestStudents` class.
//        * Create a `test` method which ensures that each of the students in your current cohort
//        are in your `Students` singleton.