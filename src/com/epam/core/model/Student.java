package com.epam.core.model;

public class Student {

    public Student (String name, int mark, String address, String faculty) {
        this.name = name;
        this.mark = mark;
        this.address = address;
        this.faculty = faculty;
    }
    private String name;
    private int mark;
    private String  address;
    private String faculty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                ", address='" + address + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
