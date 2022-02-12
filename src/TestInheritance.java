package com.company;

class myCalc{
    public void area(int side){
        System.out.println(side*side);
    }
}
class superCalc extends myCalc{
    public void areaCube(int side) {
        System.out.println(side*side*side);
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        myCalc s1 =  (myCalc) new superCalc();
        myCalc c1 = new superCalc();
    }
}
