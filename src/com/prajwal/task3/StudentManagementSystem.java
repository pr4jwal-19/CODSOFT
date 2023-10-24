package com.prajwal.task3;

import java.util.ArrayList;

public class StudentManagementSystem {

    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(String rollNum){
        students.removeIf(student -> student.getRollno().equals(rollNum));
    }
    public Student searchStudent(String rollNum){
        for (Student student:students) {
            if (student.getRollno().equals(rollNum)){
                return student;
            }
        }
        return null;
    }
    public void displayStudents(){
        for (Student student:students) {
            System.out.println(student);
        }
    }

}
