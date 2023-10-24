package com.prajwal.task3;

import java.util.Scanner;

public class StudentMSApp {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner inp = new Scanner(System.in);

        while (true){

            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int cp = inp.nextInt();
            inp.nextLine();

            switch (cp){
                case 1:
                    System.out.print("Enter student name: ");
                    String name = inp.nextLine();
                    System.out.print("Enter roll number: ");
                    String rollNumber = inp.nextLine();
                    System.out.print("Enter the Semester: ");
                    String sem = inp.nextLine();
                    System.out.print("Enter marks: ");
                    String marks = inp.nextLine();
                    System.out.print("Enter the mailID: ");
                    String email = inp.nextLine();

                    if (name.isEmpty() || rollNumber.isEmpty() || sem.isEmpty() || marks.isEmpty() || email.isEmpty()) {
                        System.out.println("Error: All fields must be filled.");
                    } else {
                        sms.addStudent(new Student(name, rollNumber, sem, marks, email));
                        System.out.println("Student added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter roll number to remove: ");
                    String removeRollNumber = inp.nextLine();
                    sms.removeStudent(removeRollNumber);
                    System.out.println("Student removed successfully.");
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    String searchRollNumber = inp.nextLine();
                    Student student = sms.searchStudent(searchRollNumber);
                    if (student != null) {
                        System.out.println("Student found: " + student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    sms.displayStudents();
                    break;

                case 5:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        }
    }
}
