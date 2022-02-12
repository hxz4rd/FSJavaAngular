package com.company;
import java.util.Scanner;

public class gradeCalculator {
    static void gradeCalc(int marks){
        if(marks>90 && marks<100){
            System.out.println("Grade A");
        }
        else if(marks>80 && marks<90){
            System.out.println("Grade B");
        }
        else if(marks>70 && marks<80){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Average");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        gradeCalc(marks);     //FOR MARKS =68
    }
}
