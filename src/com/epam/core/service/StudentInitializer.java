package com.epam.core.service;

import com.epam.core.model.Student;

import java.util.Arrays;
import java.util.List;

public class StudentInitializer {

    public static List<Student> initialize() {
        Student s1 = new Student("Fred", 7, "Minsk", "Maths");
        Student s2 = new Student("Alice", 8, "Chicago", "Literature");
        Student s3 = new Student("Betty", 7, "New York", "Geography");
        Student s4 = new Student("Liz", 6, "Moscow", "History");
        Student s5 = new Student("Ann", 5, "London", "Literature");
        Student s6 = new Student("Mary", 9, "Vilnius", "Geography");
        Student s7 = new Student("Tom", 8, "London", "Geography");
        Student s8 = new Student("Sam", 7, "Moscow", "History");
        Student s9 = new Student("Stacy", 4, "Chicago", "Literature");
        Student s10 = new Student("Sophie", 6, "Moscow", "Maths");
        Student s11 = new Student("Alice", 5, "New York", "History");
        Student s12 = new Student("Sam", 9, "Minsk", "Geography");
        Student s13 = new Student("Alex", 8, "London", "Literature");
        Student s14 = new Student("Susan", 7, "New York", "Maths");
        Student s15 = new Student("Bim", 8, "Moscow", "History");
        Student s16 = new Student("Nick", 6, "London", "Maths");
        Student s17 = new Student("Tim", 9, "Chicago", "Literature");
        Student s18 = new Student("Alice", 4, "Minsk", "Maths");

        List<Student> group = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18);
       return group;
    }

}
