package com.example.demo;

/**
 * Created by franciswalsh on 8/1/17.
 */
public class Student {

    private String firstName;
    private String lastName;
    private Grade grade;
    private boolean enrolled;

    public Student(){
        this.enrolled = true;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public boolean isEnrolled() {

        return enrolled;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
