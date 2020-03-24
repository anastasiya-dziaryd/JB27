package com.epam.core.service;

import com.epam.core.model.Student;

import java.util.List;
import java.util.stream.Stream;

public class StudentsWithUniqueName {

    public static void collectStudentsWithUniqueName (List<Student> group) {
        Stream<Student> withUniqueNames2 = group.stream()
                .map(student ->
                        new Student(student.getName(), student.getMark(), student.getAddress(), student.getFaculty()))
                .distinct();

        withUniqueNames2.forEach(System.out::println);
    }
}
