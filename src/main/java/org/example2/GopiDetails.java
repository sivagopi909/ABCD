package org.example2;

public class GopiDetails {
    public String name = "gopi";
    public int height =10;
    public float weight=88.5f;
    public double salary = 7500.50d;
    public static void main(String[] args){
        System.out.println("gopidetails");
        GopiDetails gopiDetails = new GopiDetails();
        System.out.println(gopiDetails.height);
        System.out.println(gopiDetails.weight);
    }
}
