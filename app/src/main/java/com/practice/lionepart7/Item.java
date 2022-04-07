package com.practice.lionepart7;

public class Item {
    int studentImage;
    String studentName;
    String studentDepartment;
    int studentAge;
    float studentGrades;

    public Item(int studentImage, String studentName, String studentDepartment, int studentAge) {
        this.studentImage = studentImage;
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
        this.studentAge = studentAge;
        this.studentGrades = studentGrades;
    }

    public int getStudentImage() {
        return studentImage;
    }

    public void setStudentImage(int studentImage) {
        this.studentImage = studentImage;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public float getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(float studentGrades) {
        this.studentGrades = studentGrades;
    }
}
