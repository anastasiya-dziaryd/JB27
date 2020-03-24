package com.epam.core.service;

import com.epam.core.model.Student;

import java.util.List;
import java.util.stream.Collectors;

import static com.epam.core.service.StudentsFromOneFaculty.collectStudentsFromOneFaculty;

public class StudentNameWithPrefix {

    public static void addNamePrefixToStudentsFromOneFaculty (List<Student> group, String Faculty) {

        List<Student> namesWithPrefix = collectStudentsFromOneFaculty(group, Faculty)
                .stream()
                .map(student ->
                        new Student(
                                student.getName() + "_01",
                                student.getMark(), student.getAddress(), student.getFaculty()))
                .collect(Collectors.toList());

        namesWithPrefix.forEach(System.out::println);

    }
}
