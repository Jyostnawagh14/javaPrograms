package mypack;

//Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges: 

//  1 to 100 units – Rs. 10/unit
//  100 to 200 units – Rs. 15/unit
//  200 to 300 units – Rs. 20/unit
//  above 300 units – Rs. 25/unit

//Input: U = 250 
//Output: 3500 

import java.util.Scanner;

public class CalculateElectricityBill //Class name
{
    public static void main(String[] args) //Main method
    {
        Scanner scanner = new Scanner(System.in); //it used to take user input
        
        //it takes the user input 
        System.out.print("Enter the amount of KWh units of electricity consumed: "); //we enter the amount of KWh units - U
        int unitsConsumed = scanner.nextInt();
        
        //it calculate electricity bill by consumed units 
        int totalBill = calculateElectricityBill(unitsConsumed); // total bill = total units * total charges
        
        //it shows the final calculated bill to the user
        System.out.println("Electricity Bill: Rs. " + totalBill); //shows total bill amount in Rs. which has been calculated
        
        scanner.close();
    }
    
   
    public static calculateElectricityBill(int units)
    {
        int bill = 0; //data member
        
        if (units <= 100)  //we use if - else if conditions for that so if (units <= 100) then charge is - Rs. 10/unit 
        {
            bill = units * 10;   //it calculate the bill for units in the 1 to 100 range
        }
        else if (units <= 200)  //if (units <= 200) then charge is - Rs. 15/unit
        {
            bill = 100 * 10 + (units - 100) * 15; //it calculate bill for units in the 101 to 200 range
        }
        else if (units <= 300) //if (units <= 300) then charge is - Rs. 20/unit
        {
            bill = 100 * 10 + 100 * 15 + (units - 200) * 20; //it calculate bill for units in the 201 to 300 range
        }
        else
        {
            bill = 100 * 10 + 100 * 15 + 100 * 20 + (units - 300) * 25; //it calculate bill for units above 300 & charge is Rs.. 25/unit
        }
        
        
        return bill; //finally the calculated bill is returned to the main method and displayed to the user.
    }
}

//Output:-

//Enter the amount of KWh units of electricity consumed: 250
//Electricity Bill: Rs. 3500
//Enter the amount of KWh units of electricity consumed: 100
//Electricity Bill: Rs. 1000
//Enter the amount of KWh units of electricity consumed: 200
//Electricity Bill: Rs. 2500
//Enter the amount of KWh units of electricity consumed: 300
//Electricity Bill: Rs. 4500
//Enter the amount of KWh units of electricity consumed: 452
//Electricity Bill: Rs. 8300
