package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {


    public TestPeople() {

    }

        @Test
        public void testAdd() {

            People people = new People();

            Person newPerson0 = new Person(1L, "Alex");
            people.add(newPerson0);

            Person newPerson1 = new Person(1L, "Alex");
            people.add(newPerson1);

            Integer expected = 2;
            Integer actual = people.count();

            Assert.assertEquals(expected, actual);
        }

    @Test
    public void testRemove() {

        People people = new People();

        Person newPerson0 = new Person(1L, "Alex");
        people.add(newPerson0);

        Person newPerson1 = new Person(1L, "Alex");
        people.add(newPerson1);

        people.remove(newPerson0);

        Integer expected = 1;
        Integer actual = people.count();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindById() {

        People people = new People();

        Person newPerson1 = new Person(1L, "Alex");
        people.add(newPerson1);

        Person newPerson2 = new Person(2L, "Alexi");
        people.add(newPerson2);

        Person expPerson = newPerson2;

        Person actPerson;

        actPerson = people.findById(2L);

        Assert.assertEquals(expPerson, actPerson);
    }



}

//### Part 6.0 - Test `People`
//        * Create a `TestPeople` class.
//        * Create a `testAdd` method which ensures that our `personList` in our `People` class
//          populated with respective `Person` objects following invocation of the `add` method.
//        * Create a `testRemove` method which ensures that the `personList` in a `People` object
//          is **depopulated** with a respective `Person` object following the invokation of the `remove` method.
//        * Create a `testFindById` method which ensures that a respective `Person` object with a respective `id`
//          field is returned upon invokation of the `findById` method on a respective `People` object.

