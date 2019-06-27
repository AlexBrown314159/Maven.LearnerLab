package io.zipcoder.interfaces;

public class Students extends People {
    private static Students INSTANCE = new Students();

    public static Students getInstance() {
        return INSTANCE;
    }

    private Students() {

        Student Alex_B = new Student(1001L, "Alex B");
        INSTANCE.add(Alex_B);
        Student Alex_I = new Student(1002L, "Alex I");
        INSTANCE.add(Alex_I);
        Student Donna = new Student(1003L, "Donna");
        INSTANCE.add(Donna);
        Student Dan = new Student(1004L, "Dan");
        INSTANCE.add(Dan);
        Student Andrew = new Student(1005L, "Andrew");
        INSTANCE.add(Andrew);
        Student Ben_C = new Student(1006L, "Ben C");
        INSTANCE.add(Ben_C);
        Student Henry = new Student(1007L, "Henry");
        INSTANCE.add(Henry);
        Student Caleb = new Student(1008L, "Caleb");
        INSTANCE.add(Caleb);
        Student Alicia = new Student(1009L, "Alicia");
        INSTANCE.add(Alicia);
        Student Angelica = new Student(1010L, "Angelica");
        INSTANCE.add(Angelica);
        Student Edward = new Student(1011L, "Edward");
        INSTANCE.add(Edward);
        Student Will = new Student(1012L, "Will");
        INSTANCE.add(Will);
        Student Darya = new Student(1013L, "Darya");
        INSTANCE.add(Darya);
        Student Robert = new Student(1014L, "Robert");
        INSTANCE.add(Robert);
        Student Abram = new Student(1015L, "Abram");
        INSTANCE.add(Abram);
        Student Justin = new Student(1016L, "Justin");
        INSTANCE.add(Justin);
        Student Sputnika = new Student(1017L, "Sputnika");
        INSTANCE.add(Sputnika);
        Student Aashna = new Student(1018L, "Aashna");
        INSTANCE.add(Aashna);
        Student Anish = new Student(1019L, "Anish");
        INSTANCE.add(Anish);
        Student Ajulu = new Student(1020L, "Ajulu");
        INSTANCE.add(Ajulu);
        Student Ben_R = new Student(1021L, "Ben R");
        INSTANCE.add(Ben_R);
        Student Connor = new Student(1022L, "Connor");
        INSTANCE.add(Connor);
        Student Erick = new Student(1023L, "Erick");
        INSTANCE.add(Erick);
        Student Joanna = new Student(1024L, "Joanna");
        INSTANCE.add(Joanna);
        Student Reese = new Student(1025L, "Reese");
        INSTANCE.add(Reese);
        Student Stefun = new Student(1026L, "Stefun");
        INSTANCE.add(Stefun);
        Student Prasanthi = new Student(1027L, "Prasanthi");
        INSTANCE.add(Prasanthi);
        Student Kavya = new Student(1028L, "Kavya");
        INSTANCE.add(Kavya);
        Student Bob = new Student(1029L, "Bob");
        INSTANCE.add(Bob);

    }
}

//### Part 7.1 - Create `Students` singleton
//        * **Note:** The creation of this class will demonstrate an implementation of [singleton design pattern](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#eager-initialization).
//        * Create a `Students` class.
//        * The class should be an _unextendable_ subclass of the `People` class.
//        * The class should _statically instantiate_ a `final` field named `INSTANCE` of type `Students`.
//        * The class should define a _private nullary constructor_ which populates the `INSTANCE` field
//          with respective `Student` representations of your colleagues.
//        * Each student should have a _relatively_ unique `id` field.
//        * The class should define a `getInstance` method which returns the `INSTANCE` field.
