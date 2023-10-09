package mypack;

//Write a program using constructor overloading. create a class Person with Id, Name, Designation
//Give user input & according to that call a constructor
//Give the choices to user to choose the operations that they want to do

import java.util.Scanner;

class Person //Class name
{
                     
    private int id;// Data members
    private String name;
    private String designation;

    // Constructor with ID and Name
    public Person(int id, String name)
    
    {
        this.id = id;
        this.name = name;
        this.designation = "Default Designation"; // Default value for designation
    }

    // Constructor with Name and Designation
    public Person(String name, String designation)
    {
        this.id = 0; // Default value for ID
        this.name = name;
        this.designation = designation;
    }

    // Constructor with all fields
    public Person(int id, String name, String designation)
    {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    // Method to display person details
    public void displayDetails()
    
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

public class UsePerson //Class name
{
	public static void main(String args[]) //Main method
	
	{
        Scanner scanner = new Scanner(System.in);//used for given user input

        System.out.println("Enter your choice:"); //print the choice
        System.out.println("1. Add ID and Name");
        System.out.println("2. Add Name and Designation");
        System.out.println("3. Add ID, Name, and Designation");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice)//switch statement is used
        {
            case 1: //Case 1 is used for choice of "1. Add ID and Name"
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                Person person1 = new Person(id, name);
                person1.displayDetails();
                break;

            case 2: //Case 2 is used for choice of "2. Add Name and Designation"
                System.out.print("Enter Name: ");
                String name2 = scanner.nextLine();
                System.out.print("Enter Designation: ");
                String designation2 = scanner.nextLine();
                Person person2 = new Person(name2, designation2);
                person2.displayDetails();
                break;

            case 3: //Case 2 is used for choice of "3. Add ID, Name, and Designation" 
                System.out.print("Enter ID: ");
                int id3 = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.print("Enter Name: ");
                String name3 = scanner.nextLine();
                System.out.print("Enter Designation: ");
                String designation3 = scanner.nextLine();
                Person person3 = new Person(id3, name3, designation3);
                person3.displayDetails();
                break;

            default: //default case for invalid choice
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

