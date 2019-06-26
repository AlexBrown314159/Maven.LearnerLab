package io.zipcoder.interfaces;

public interface Teacher {

    public void teach(Learner learner, Double numberOfHours);

    public void lecture(Learner[] learners, Double numberOfHours);

}

//* Create a `Teacher` interface.
//        * `Teacher` should declare a `teach` method signature:
//        * Method name: `teach`
//        * Method parameters:
//        * `Learner learner`
//        * `double numberOfHours`
//        * Method return-type: `void`
//
//        * `Teacher` should declare a `lecture` method signature:
//        * Method name: `lecture`
//        * Method parameters:
//        * `Learner[] learners`
//        * `double numberOfHours`
//        * Method return-type: `void`