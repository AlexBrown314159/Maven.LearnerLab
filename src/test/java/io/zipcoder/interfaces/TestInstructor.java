package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void TestImplementation() {

        Instructor newInstructor = new Instructor(12347L, "Dolio");

        Assert.assertTrue(newInstructor instanceof Teacher);

    }

    @Test
    public void TestInheritance() {

        Instructor newInstructor = new Instructor(12347L, "Dolio");

        Assert.assertTrue(newInstructor instanceof Person);

    }

    @Test
    public void TestTeach() {

        Instructor newInstructor = new Instructor(12347L, "Dolio");

        Student newStudent = new Student(12345L, "Alex");

        Double expected = 38.75;

        newStudent.learn(expected);

        Double actual = newStudent.totalStudyTime;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void TestLecture() {

        Instructor newInstructor = new Instructor(12347L, "Dolio");

        Student newStudent0 = new Student(12345L, "Alex");
        Student newStudent1 = new Student(12349L, "Alexi");

        Student[] students = new Student[2];
        students[0] = newStudent0;
        students[1] = newStudent1;

        Double expected = 38.0;

        newInstructor.lecture(students, expected);

        expected = 38.0 / students.length;

        Double actual = newStudent0.totalStudyTime;

        Assert.assertEquals(expected, actual);

    }

}

//### Part 5.0 - Test `Instructor`
//        * Create a `TestInstructor` class.
//        * Create a `testImplementation` method that asserts that an `Instructor` is an `instanceof` a `Teacher`.
//        * Create a `testInheritance` method that asserts that a `Instructor` is an `instanceof` a `Person`.
//        * Create a `testTeach` method that ensures when an `Instructor` invokes the `teach` method, a respective
//          student's `totalStudyTime` instance variable is incremented by the specified `numberOfHours`.
//        * Create a `testLecture` method that ensures when an `Instructor` invokes the `lecture` method,
//          a respective array of students' `totalStudyTime` instance variables is incremented
//          by `numberOfHours/students.length`.

