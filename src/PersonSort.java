package com.company;
import java.util.Arrays;
import java.util.Comparator;

class Person{
    private int id;
    private String name;

//Constructor
    public Person(int id,String name){
        this.id=id;
        this.name=name;
    }
//Getters & Setters
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
//Overriding toString Method
    @Override
    public String toString(){
        return "{id= "+id+", name="+name+"}";
    }
}


//Sorting classes implementing Comparator
 class SortById implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        return p1.getId()-p2.getId();
    }
 }
class SortByName implements  Comparator<Person>{
    public int compare(Person p1,Person p2){
        return p1.getName().compareTo(p2.getName());
    }
}
class SortByBoth implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        int check=p1.getId()-p2.getId();
        if(check==0){
            check=p1.getName().compareTo(p2.getName());
        }
        return check;
    }
}

//Main class & Program
public class PersonSort {
    public static void main(String[] args) {
       Person[] p1 = new Person[4];
       p1[0]= new Person(101,"zRaj");
       p1[1]= new Person(112,"Rajesh");
       p1[2]= new Person(106,"Suraj");
       p1[3]= new Person(101,"Tom");
        System.out.println("Sorting By Id: ");
        Arrays.sort(p1, new SortById());
        for(Person p: p1){
            System.out.println(p);
        }
        Arrays.sort(p1,new SortByName());
        System.out.println("Sorting By Name: ");
        for (Person p: p1){
            System.out.println(p);
        }
        System.out.println("SortByBoth: ");
        Arrays.sort(p1, new SortByBoth());
        for (Person p: p1){
            System.out.println(p);
        }
    }
}
