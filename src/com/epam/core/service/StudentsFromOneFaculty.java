package com.epam.core.service;

import com.epam.core.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentsFromOneFaculty {

    public static List<Student> collectStudentsFromOneFaculty(List<Student> group, String Faculty) {
        List<Student> fromOneFaculty = group.stream()
                .filter(student -> student.getFaculty().equals(Faculty))
                .collect(Collectors.toList());

        fromOneFaculty.forEach(System.out::println);
        return fromOneFaculty;
    }
}
