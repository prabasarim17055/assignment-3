package com.company.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Emplyee Type: ");
        Scanner scanner=new Scanner(System.in);
        String type=scanner.next();

        System.out.println("Name: ");
        String name=scanner.next();

        System.out.println("Working hours: ");
        int hoursWorked=scanner.nextInt();

        System.out.println("Rate: ");
        double rate=scanner.nextDouble();

        EmplyeeFactory emplyeeFactory=new EmplyeeFactory();
        Employee employee=emplyeeFactory.getInstance(type,name,hoursWorked,rate);

        System.out.println("Salary (Total): " + employee.calcSalary());





    }

}
