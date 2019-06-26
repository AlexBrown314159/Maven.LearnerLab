package io.zipcoder.interfaces;

public class Instructors {
    private static Instructors ourInstance = new Instructors();

    public static Instructors getInstance() {
        return ourInstance;
    }

    private Instructors() {
    }
}
