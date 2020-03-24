package com.epam.core.display;

import com.epam.core.model.Student;
import com.epam.core.service.StudentInitializer;

import java.util.*;

import static com.epam.core.service.StudentNameWithPrefix.addNamePrefixToStudentsFromOneFaculty;
import static com.epam.core.service.StudentWithHighestMark.findStudentWithHighestMark;
import static com.epam.core.service.StudentsFromOneFaculty.collectStudentsFromOneFaculty;
import static com.epam.core.service.StudentsWithUniqueName.collectStudentsWithUniqueName;

public class Main {

    public static void main(String[] args) {

        List<Student> group = StudentInitializer.initialize();

        // Collect all students from one faculty on a separate list.
        collectStudentsFromOneFaculty(group, "Literature");

        System.out.println();

        //Find student with the highest average mark
        findStudentWithHighestMark(group);

        System.out.println();

        //For each student name from some specific faculty add prefix, like (_01)
        addNamePrefixToStudentsFromOneFaculty(group, "Maths");

        System.out.println();

        //Collect all students with unique name in a separate List
        collectStudentsWithUniqueName(group);
    }
}
