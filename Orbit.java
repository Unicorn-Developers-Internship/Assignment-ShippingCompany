package com.company;

/* Program to calculate the cost of shipping
for a shipping company
 */


import java.util.Scanner;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("****Welcome to Orbit Company****");
        System.out.println("Please enter the weight of the package(weight in pounds):");
        double packageWeight;
        double costOfPackage = 0.0;
        packageWeight = input.nextDouble();
        System.out.println("Calculating cost in dollars...");
        //range of weight to determine cost in dollars of package
        if(packageWeight > 0 && packageWeight <=2){
            costOfPackage = 2.5;
        }
        else if(packageWeight > 2 && packageWeight <= 4){
            costOfPackage = 4.5;
        }
        else if(packageWeight > 4 && packageWeight <= 10){
            costOfPackage = 7.5;
        }
        else if(packageWeight > 10 && packageWeight <= 20){
            costOfPackage = 10.5;
        }
        else if(packageWeight > 20) {
            costOfPackage = 0.0;
        }

        if(costOfPackage > 0){
            System.out.printf("The cost of your package which weighs %.3f pounds is %.1f dollars", packageWeight, costOfPackage);
        }
        else {
            System.out.printf("Sorry,your package which weighs %.3f pounds cannot be shipped.", packageWeight);
        }
        System.out.println("\n::::::::::Program ended:::::::::");


    }
}


