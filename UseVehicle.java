package mypack;

//Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive".
//Create a child class called "Car" that inherits from class Vehicle with attribute color & method Honk()
//Create an object of the Car class and call both the "drive" and "honk" methods. 

class Vehicle //Parent class: Vehicle
{
 String brand; //Data member
 String model;
 int year;

 // Constructor for the Vehicle class
 public Vehicle(String brand, String model, int year)
 {
     this.brand = brand;
     this.model = model;
     this.year = year;
 }

 //Drive() method to drive the vehicle
 public void drive()
 {
     System.out.println("Driving the " + brand + " " + model);
 }
}

class Car extends Vehicle //Child class: Car (inherits from Vehicle)
{
 String color; //Data member

 // Constructor for the Car class
 public Car(String brand, String model, int year, String color)
 {
     // Call the constructor of the parent class using the 'super' keyword
     super(brand, model, year);
     this.color = color;
 }

 //Honk() method to honk the car's horn
 public void honk()
 {
     System.out.println("Honking the " + color + " " + brand + " " + model);
 }
}

public class UseVehicle  //Class name

{
 public static void main(String[] args) //Main method
 {
     // Create an object of the Car class
     Car myCar = new Car("Toyota", "Camry", 2023, "White");

     // Call the "drive" method of the Car class (inherited from Vehicle)
     myCar.drive(); // Output: Driving the Toyota Camry

     // Call the "honk" method of the Car class
     myCar.honk(); // Output: Honking the White Toyota Camry

 }
}

