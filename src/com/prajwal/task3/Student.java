package com.prajwal.task3;

public class Student {

    private final String name;
    private final String rollno;
    private final String sem;
    private final String marks;
    private final String email;

    public Student(String name,String rollno, String sem, String marks, String email){
        this.name = name;
        this.rollno = rollno;
        this.sem = sem;
        this.marks = marks;
        this.email = email;
    }






    public String getRollno() {
        return rollno;
    }



    public String toString(){
        return "Name: "+name+" | Roll.No: "+rollno+" | Sem: "+sem+" | Marks: "+marks+" | EmailID: "+email;
    }

}
