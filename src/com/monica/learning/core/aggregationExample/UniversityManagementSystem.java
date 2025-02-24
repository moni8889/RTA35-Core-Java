package com.monica.learning.core.aggregationExample;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber ;
    }

    //Constructor to initialize student class objects
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    //Method to display the student details
    public void displayStudentDetails() {
        System.out.println("Student Name:" + name + " and student roll number is :" + rollNumber);
    }
}
class University{
    List<Student> studentlist = new ArrayList<>();

    //method to add students
    public void addStudents(Student student){
        studentlist.add(student);
    }

    //Methods to display all students
    public void displayStudents(){
        if(studentlist.isEmpty()){
            System.out.println("students left from the University ");
        } else{
            for (Student student : studentlist){
                student.displayStudentDetails();
            }
        }
    }

}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        //create a university instance
        University university = new University();

        //create student instance
        Student s1 = new Student("Deetya" , 102);
        Student s2 = new Student ("Praanya", 103);
        Student s3 = new Student ("Vedya",104);

        //add students to the university
        university.addStudents(s1);
        university.addStudents(s2);
        university.addStudents(s3);

        //Display student details
        System.out.println("Students studying in the university:");

        //initialize the university object as null to removing university//

        university = null;

        //display student details after removing the university
        System.out.println("Student1:" + s1.getName() + "," + s1.getRollNumber());
        System.out.println("Student2:" + s2.getName() + "," + s2.getRollNumber());
        System.out.println("Student3:" + s3.getName() + "," + s3.getRollNumber());
    }
}
