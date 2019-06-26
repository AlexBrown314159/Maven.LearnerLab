package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher {


    public Instructor(Long inId, String inName) {
        super(inId, inName);
    }

    public void teach(Learner learner, Double numberOfHours) {

        learner.learn(numberOfHours);

    }

    public void lecture(Learner[] learners, Double numberOfHours) {

        for (int i = 0; i < learners.length; i++) {

            learners[i].learn(numberOfHours / learners.length);

        }

    }
}

//* Create an `Instructor` class such that:
//  * `Instructor` is a subclass of `Person`
//  * `Instructor` implements the `Teacher` interface
//	* `Instructor` should have a concrete implementation of the `teach` method
//     which invokes the `learn` method on the specified `Learner` object.
//  * `Instructor` should have a concrete implementation of the `lecture` method
//     which invokes the `learn` method on each of the elements in the specified array of `Learner` objects.
//  * `numberOfHours` should be evenly split amongst the learners.
//  * `double numberOfHoursPerLearner = numberOfHours / learners.length;`




