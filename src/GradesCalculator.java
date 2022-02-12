package com.company;
import java.util.Arrays;
import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private int physicsMarks;
    private int chemistryMarks;
    private int mathsMarks;

    //CONSTRUCTOR
    public Student(){

    }
    public Student(int id,String name,int physicsMarks,int chemistryMarks,int mathsMarks){
        this.id=id;
        this.name=name;
        this.chemistryMarks=chemistryMarks;
        this.physicsMarks=physicsMarks;
        this.mathsMarks=mathsMarks;
    }

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    // OVERRIDING toSTRING METHOD
    @Override
    public String toString(){
        return "Details= {id="+id+" ,name="+name+" ,pMarks="+physicsMarks+" ,cMarks="+chemistryMarks+" ,mMarks="+mathsMarks+"}";
    }
    public char GradeOfStudent(Student st){
        char grade =' ';
        int avg = (st.chemistryMarks+st.mathsMarks+st.physicsMarks)/3;
        if(avg>80){
             grade='A';
        }
        else if(avg >70){
             grade='B';
        }
        else if(avg>60){
             grade='C';
        }
        else {
            grade='D';
        }
        return grade;
    }

    public int avgMarks(Student st){
        return (st.physicsMarks+st.mathsMarks+st.chemistryMarks)/3;
    }
    public Student maxScorer(Student[] st){
        Student max = st[0];
        for (Student student : st) {
            for (int j = 1; j < st.length; j++) {
                if (avgMarks(st[j]) > avgMarks(student)) {
                    max = st[j];
                }
            }

        }
        return max;
    }
}
public class GradesCalculator {
    public static void main(String[] args) {

        Student[] studentArray = new Student[4];
        Student s1 = new Student();
        studentArray[0]= new Student(101,"Aman",87,72,54);
        studentArray[1]= new Student(102,"David",57,63,66);
        studentArray[2]= new Student(103,"Grace",87,98,94);
        studentArray[3]= new Student(104,"Marcus",97,88,64);

        System.out.println(s1.maxScorer(studentArray)+" with Grade= "+"'"+s1.GradeOfStudent(s1.maxScorer(studentArray))+"'");
    }
}
