package org.example2;

public class Jobless {

    private static Jobless jobless;
    int months = 12;
    int days = 365;
    float hours = 16 * 365f;

    public Jobless(int months, int days, float hours, String company) {
    }

    public static void main(String[] args) {
        Jobless jobless = new Jobless(12, 365, 8 * 365f, "Google");
        String company = "Google";
        System.out.println(jobless.months);
        System.out.println(jobless.days);
        System.out.println(jobless.hours);
        System.out.println(company);
    }
}

