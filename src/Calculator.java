package com.company;
import java.util.Scanner;

class Evaluate{
    double num1;
    double num2;
    double result;

    public Evaluate(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void add(){
        result=num1+num2;
        System.out.println("Addition is "+result);
    }
    public void subtract(){
        result=num1-num2;
        System.out.println("Subtraction is "+result);
    }
    public void product(){
        result=num1*num2;
        System.out.println("Product is "+result);
    }
    public void divide(){
        result=num1/num2;
        System.out.println("Division is "+result);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1= sc.nextDouble();
        System.out.println("Enter second number");
        double num2= sc.nextDouble();

        Evaluate e1 = new Evaluate(num1,num2);

        e1.add();      //FOR ADDITION
        e1.subtract(); //FOR SUBTRACTION
        e1.product();  //FOR PRODUCT
        e1.divide();   //FOR DIVIDE
    }
}
