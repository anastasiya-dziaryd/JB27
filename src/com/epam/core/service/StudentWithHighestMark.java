package com.epam.core.service;

import com.epam.core.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentWithHighestMark {

    public static void findStudentWithHighestMark (List<Student> group) {
        Comparator<Student> comparator = Comparator.comparing( Student::getMark );

        Student oneWithMaxMark = group.stream()
                .max(comparator)
                .get();

        int maxMark = oneWithMaxMark.getMark();

        List<Student> allWithMaxMark = group.stream()
                .filter(student -> student.getMark() == maxMark)
                .collect(Collectors.toList());

        allWithMaxMark.forEach(System.out::println);
    }
}
