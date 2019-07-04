package io.zipcoder.interfaces;

public final class Students extends People {
    public static final Students INSTANCE = new Students();


    protected Students() {

       Student Alex_B = new Student(1001L, "Alex B");
       this.add(Alex_B);
       Student Alex_I = new Student(1002L, "Alex I");
       this.add(Alex_I);
       Student Donna = new Student(1003L, "Donna");
       this.add(Donna);
       Student Dan = new Student(1004L, "Dan");
       this.add(Dan);
       Student Andrew = new Student(1005L, "Andrew");
       this.add(Andrew);
       Student Ben_C = new Student(1006L, "Ben C");
       this.add(Ben_C);
       Student Henry = new Student(1007L, "Henry");
       this.add(Henry);
       Student Caleb = new Student(1008L, "Caleb");
       this.add(Caleb);
       Student Alicia = new Student(1009L, "Alicia");
       this.add(Alicia);
       Student Angelica = new Student(1010L, "Angelica");
       this.add(Angelica);
       Student Edward = new Student(1011L, "Edward");
       this.add(Edward);
       Student Will = new Student(1012L, "Will");
       this.add(Will);
       Student Darya = new Student(1013L, "Darya");
       this.add(Darya);
       Student Robert = new Student(1014L, "Robert");
       this.add(Robert);
       Student Abram = new Student(1015L, "Abram");
       this.add(Abram);
       Student Justin = new Student(1016L, "Justin");
       this.add(Justin);
       Student Sputnika = new Student(1017L, "Sputnika");
       this.add(Sputnika);
       Student Aashna = new Student(1018L, "Aashna");
       this.add(Aashna);
       Student Anish = new Student(1019L, "Anish");
       this.add(Anish);
       Student Ajulu = new Student(1020L, "Ajulu");
       this.add(Ajulu);
       Student Ben_R = new Student(1021L, "Ben R");
       this.add(Ben_R);
       Student Connor = new Student(1022L, "Connor");
       this.add(Connor);
       Student Erick = new Student(1023L, "Erick");
       this.add(Erick);
       Student Joanna = new Student(1024L, "Joanna");
       this.add(Joanna);
       Student Reese = new Student(1025L, "Reese");
       this.add(Reese);
       Student Stefun = new Student(1026L, "Stefun");
       this.add(Stefun);
       Student Prasanthi = new Student(1027L, "Prasanthi");
       this.add(Prasanthi);
       Student Kavya = new Student(1028L, "Kavya");
       this.add(Kavya);
       Student Bob = new Student(1029L, "Bob");
       this.add(Bob);

    }



    public static Students getInstance() {
        return INSTANCE;
    }

}

//### Part 7.1 - Create `Students` singleton
//        * **Note:** The creation of this class will demonstrate an implementation of [singleton design pattern]
//                    (https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#eager-initialization).
//        * Create a `Students` class.
//        * The class should be an _unextendable_ subclass of the `People` class.
//        * The class should _statically instantiate_ a `final` field named `INSTANCE` of type `Students`.
//        * The class should define a _private nullary constructor_ which populates the `INSTANCE` field
//          with respective `Student` representations of your colleagues.
//        * Each student should have a _relatively_ unique `id` field.
//        * The class should define a `getInstance` method which returns the `INSTANCE` field.
