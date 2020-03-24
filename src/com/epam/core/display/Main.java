package com.epam.core.display;

import com.epam.core.model.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

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

        // Collect all students from one faculty on a separate list.
        List<Student> fromLiteratureFaculty = group.stream()
                .filter(i -> i.getFaculty() == "Literature")
                .collect(Collectors.toList());

        fromLiteratureFaculty.forEach(System.out::println);

        //Find student with the highest average mark
        System.out.println();

        Comparator<Student> comparator = Comparator.comparing( Student::getMark );

        Student oneWithMaxMark = group.stream()
                .max(comparator)
                .get();

        int maxMark = oneWithMaxMark.getMark();

        List<Student> allWithMaxMark = group.stream()
                .filter(i -> i.getMark() == maxMark)
                .collect(Collectors.toList());

        allWithMaxMark.forEach(System.out::println);

        //For each student name from some specific faculty add prefix, like (_01)
        System.out.println();

        List<String> fromMathsFaculty = group.stream()
                .filter(i -> i.getFaculty() == "Maths")
                .map(i -> i.getName() + "_01")
                .collect(Collectors.toList());

        fromMathsFaculty.forEach(System.out::println);

        //Collect all students with unique name in a separate List#1
        System.out.println();
        Set<String> set = new HashSet<>(group.size());
        List<Student> withUniqueNames = group.stream()
                .filter(p -> set.add(p.getName()))
                .collect(Collectors.toList());

        withUniqueNames.forEach(System.out::println);

        //Collect all students with unique name in a separate List#2
        System.out.println();
        Stream<String> withUniqueNames2 = group.stream()
                .map(i -> i.getName())
                .distinct();

        withUniqueNames2.forEach(System.out::println);
    }
}
