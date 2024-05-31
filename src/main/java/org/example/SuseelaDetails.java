package org.example;

public class SuseelaDetails {
    public String name ="Skodavati";
    public int age = 25;
    public float percentage = 99.5f;
    public double weight = 66.5d;
    public boolean boy =true;
    public boolean girl=false;
    public static void main(String[] args){
        SuseelaDetails suseelaDetails = new SuseelaDetails();
        System.out.println(suseelaDetails.age);
        System.out.println(suseelaDetails.name);
        System.out.println(suseelaDetails.percentage);
        System.out.println(suseelaDetails.weight);
        System.out.println(suseelaDetails.girl);
    }
}
