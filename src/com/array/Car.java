package com.array;

import java.util.Scanner;

//WAP to Create array of cars where car is user-defined class.
//Car class has variables such as name color mileage and price. Accept details of 3 cars and 
//store in the array. print the car name with highest mileage.

public class Car {
	String name;
  String color;
  double mileage;
  double price;

      Car(String name, String color, double mileage, double price) {
      this.name = name;
      this.color = color;
      this.mileage = mileage;
      this.price = price;
  }
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Car[] cars = new Car[3];

          // Input details for 3 cars
          for (int i = 0; i < cars.length; i++) {
              System.out.println("Enter details for Car " + (i + 1) + ":");
              System.out.print("Name: ");
              String name = sc.nextLine();
              System.out.print("Color: ");
              String color = sc.nextLine();
              System.out.print("Mileage: ");
              double mileage = sc.nextDouble();
              System.out.print("Price: ");
              double price = sc.nextDouble();
              sc.nextLine(); // Consume newline left after nextDouble()

              cars[i] = new Car(name, color, mileage, price);
          }

          // Find the car with the highest mileage
          double maxMileage = cars[0].mileage;
          String bestMileageCarName = cars[0].name;

          for (int i = 1; i < cars.length; i++) {
              if (cars[i].mileage > maxMileage) {
                  maxMileage = cars[i].mileage;
                  bestMileageCarName = cars[i].name;
              }
          }

          System.out.println("\nCar with the highest mileage: " + bestMileageCarName);
      }

}
