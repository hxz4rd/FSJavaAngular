package com.company;
import java.util.ArrayList;

class PersonDetails{
    private int id;
    private String name;
    private int mMarks;
    private int cMarks;
    private int pMarks;

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

    public int getmMarks() {
        return mMarks;
    }

    public void setmMarks(int mMarks) {
        this.mMarks = mMarks;
    }

    public int getcMarks() {
        return cMarks;
    }

    public void setcMarks(int cMarks) {
        this.cMarks = cMarks;
    }

    public int getpMarks() {
        return pMarks;
    }

    public void setpMarks(int pMarks) {
        this.pMarks = pMarks;
    }
   public PersonDetails(){
   }
    public PersonDetails(int id, String name, int mMarks, int cMarks, int pMarks){
        this.id=id;
        this.name=name;
        this.mMarks=mMarks;
        this.cMarks=cMarks;
        this.pMarks=pMarks;
    }
    public double avgMarks(){
        return (double) (this.cMarks+ this.pMarks+ this.mMarks)/3;
    }
    public char checkGrade(){
        char grade=' ';
        if(avgMarks()>89 && avgMarks()<101){
            grade='A';
        }
        else if(avgMarks()>79 && avgMarks()<91){
            grade='B';
        }
        else if(avgMarks()>69 && avgMarks()<81){
            grade='C';
        }
        else {
            grade='D';
        }
        return grade;
    }
    public void  display(PersonDetails[] personDetails){
        for (int i=0;i< personDetails.length;i++){
            if(personDetails[i]== null){
                return;
            }
            System.out.println(personDetails[i].getName());
        }
    }
}
interface Hire{
    public PersonDetails[] checkHiring(PersonDetails[] personArray);
}

class TCS implements Hire{
    @Override
    public PersonDetails[] checkHiring(PersonDetails[] personArray) {
        PersonDetails[] array = new PersonDetails[personArray.length];
        ArrayList<String> TCSlist = new ArrayList<>();
        int k=0;
        for(int i=0;i< personArray.length;i++){
            if(personArray[i].avgMarks()>50){
                TCSlist.add(personArray[i].getName());
                array[k]=personArray[i];
                k++;
            }
        }
        System.out.println("Selected students for TCS : "+TCSlist);
        return array;
    }
}

class Accenture implements Hire{
    @Override
    public PersonDetails[] checkHiring(PersonDetails[] personArray) {
        PersonDetails[] array = new PersonDetails[personArray.length];
        ArrayList<String> AccentureList = new ArrayList<>();
        int k=0;
        for(int i=0;i< personArray.length;i++){
            if((personArray[i].checkGrade()=='A' && personArray[i].getmMarks()>90)){
                AccentureList.add(personArray[i].getName());
                array[k]=personArray[i];
                k++;
            }
        }
        System.out.println("Students selected in Accenture: "+AccentureList);
        return array;
    }
}
class XTZ implements Hire{
    @Override
    public PersonDetails[] checkHiring(PersonDetails[] personArray) {
        PersonDetails[] array = new PersonDetails[personArray.length];
        ArrayList<String> XTZlist = new ArrayList<>();
        int k =0;
        for(int i=0;i< personArray.length;i++){
            if((personArray[i].avgMarks()>50)){
                XTZlist.add(personArray[i].getName());
                array[k]=personArray[i];
            }
        }
        System.out.println("Students selected for XTZ: "+XTZlist);
        return array;
    }
}

class Adidas implements Hire{
    @Override
    public PersonDetails[] checkHiring(PersonDetails[] personArray) {
        PersonDetails[] array = new PersonDetails[personArray.length];
        ArrayList<String> AdidasList = new ArrayList<>();
        int k =0;
        for(int i=0;i< personArray.length;i++){
            if((personArray[i].avgMarks()>50)){
                AdidasList.add(personArray[i].getName());
                array[k]=personArray[i];
            }
        }
        System.out.println("Students selected in Adidas: "+AdidasList);
        return array;
    }
}
public class HiringInfo {
    public static void main(String[] args) {
        PersonDetails[] personArray = new PersonDetails[4];
        PersonDetails p1 = new PersonDetails();
        personArray[0]= new PersonDetails(101,"Raj",99,98,96);
        personArray[1]= new PersonDetails(102,"Rajesh",70,70,70);
        personArray[2]= new PersonDetails(103,"Suresh",80,80,80);
        personArray[3]= new PersonDetails(104,"Tom",75,75,75);



        TCS t1 = new TCS();
//        t1.checkHiring(personArray);
        p1.display(t1.checkHiring(personArray));

        Accenture acc = new Accenture();
        acc.checkHiring(personArray);

        Adidas a1 = new Adidas();
        a1.checkHiring(personArray);

        XTZ x1 = new XTZ();
        x1.checkHiring(personArray);

//        PersonDetails[] selected =  new PersonDetails[4];
//        selected = t1.checkHiring(personArray);
//        p1.display(selected);
    }
}
