package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {

        Student newStudent = new Student(12346L, "Alex Brown");

        Assert.assertTrue(newStudent instanceof Learner);

    }

    @Test
    public void TestInheritance() {

        Student newStudent = new Student(12346L, "Alex Brown");

        Assert.assertTrue(newStudent instanceof Person);

    }

    @Test
    public void TestLearn() {

        Student newStudent = new Student(12346L, "Alex Brown");

        Double expected = 27.39;

        newStudent.learn(expected);

        Double actual = newStudent.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

}

//### Part 3.0 - Test `Student`
//        * Create a `TestStudent` class.
//        * Create a `testImplementation` method that asserts that a `Student` is an `instanceof` a `Learner`.
//        * Create a `testInheritance` method that asserts that a `Student` is an `instanceof` a `Person`.
//        * Create a `testLearn` method that ensures a `Student`'s `totalStudyTime` instance variable is incremented
//                    by the specified `numberOfHours` by invoking the `.learn` method.
