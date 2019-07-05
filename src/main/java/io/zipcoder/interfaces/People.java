package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class People {

    ArrayList<Person> personList = new ArrayList();




    public void People() {

    }




    public void add(Person person) {
        personList.add(person);

    }




    public Person findById(Long id) {

        Person newPerson;

        for (int i = 0; i < personList.size(); i++) {
            newPerson = personList.get(i);

            if (newPerson.getId() == id) {
                return newPerson;
            }
        }
        return null;
    }





    public Boolean contains(Person person) {

            if (personList.contains(person)) {
                return true;
            }
        return false;
    }






    public void remove(Person person) {

         personList.remove(person);
    }






    public void remove(Long id) {

        Person newPerson = new Person(1L, "Alex");

        for (int i = 0; i < personList.size(); i++) {
            newPerson = personList.get(i);

            if (newPerson.getId() == id) {
                personList.remove(newPerson);
            }
        }
    }





    public void removeall() {

        for (int i = 0; i < personList.size(); i++) {

            personList.remove(i);
        }
    }







    public Integer count() {

        return personList.size();
    }








    public ArrayList toArray() {

        return personList;
    }







    public void iterator() {

    }



}

//### Part 6.1 - Create `People` class
//* Create a `People` class.
//        * The class should instantiate a `List` field of `Person` objects named `personList`.
//        * The class should define a method named `add` which adds a `Person` to the `personList`.
//        * The class should define a method named `findById` which makes use of a `long id` parameter
//          to return a `Person` object with the respective `id` field.
//        * The class should define a named `contains` which makes use of a `Person person` parameter
//          to return `true` if the `personList` contains the respective `Person` object.
//        * The class should define a method named `remove` which makes use of a `Person person` parameter
//          to remove a respective `Person` object.
//        * The class should define a method named `remove` which makes use of a `long id` parameter
//          to remove a `Person` object with the respective `id` field.
//        * The class should define a named `removeAll` which clears our `personList` field.
//        * The class should define a method named `count` which returns the size of `personList`.
//        * The class should define a method named `toArray` which returns an array representation
//          of the `personList` field.
//        * The class should implement `Iterable<E>` and define a method named `iterator` which
//          makes use of the `personList` field to generate a new a `Iterator<E>`.
//
//
//           for (Person person : personList) {
//           System.out.println(person);
//           }



