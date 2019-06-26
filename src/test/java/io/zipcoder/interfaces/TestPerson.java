package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void getIdTest() {

        Person newPerson = new Person(12345L, "Alex Brown");

        Long act = newPerson.getId();
        Long exp = 12345L;

        Assert.assertEquals(act, exp);
    }

    @Test
    public void getNameTest() {

        Person newPerson = new Person(12345L, "Alex Brown");

        String act = newPerson.getName();
        String exp = "Alex Brown";

        Assert.assertEquals(act, exp);
    }

    @Test
    public void setGetNameTest() {

        Person newPerson = new Person(12345L, "Alex Brown");

        String newName = "John Smith";
        newPerson.setName(newName);
        String act = newPerson.getName();
        String exp = "John Smith";

        Assert.assertEquals(act, exp);
    }

}


//### Part 1.0 - Test `Person`
//* Create a `TestPerson` class.
//* Create a `testConstructor` method which ensures that a `Person` object's `id` and `name` field
//            are being set upon construction.
//* Create a `testSetName` method which ensures that a `Person` object's `name` variable is being
//            set by invoking the `.setName` method.


