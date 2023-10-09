package mypack;

//WAP to reverse a number given by user and also find the addition of all the numbers.

import java.util.Scanner;

public class ReverseNumber1  //Class name
{
    public static void main(String[] args) //Main method
    {
        Scanner scanner = new Scanner(System.in);  //It is used to take a input from user
        
        System.out.print("Enter a number: "); //We take a input of number from the user
        int number = scanner.nextInt();
        
        int reversedNumber = 0;  //We calculate the reverse of the number
        int originalNumber = number;
        while (number != 0) //While loop is used to satisfy the condition
        {
            int digit = number % 10; //we find the remainder of the given number
            reversedNumber = reversedNumber * 10 + digit;  //Multiply the number reverse by 10 and add the remainder in it
            number /= 10;  //Divide the number by 10
        }
        
        int sum = 0;  //We calculate the sum of the digits
        while (originalNumber != 0)
        {
            int digit = originalNumber % 10; //we find the remainder of the original number
            sum += digit; //calculate the sum of digit
            originalNumber /= 10; //Divide the original number by 10
        }
        
        // Display results
        System.out.println("Reversed number: " + reversedNumber); //it display reversed number
        System.out.println("Sum of digits: " + sum); //it display sum of digits
        
        scanner.close(); //close the program
    }
}

//Output:-
//Enter a number: 123456789
//Reversed number: 987654321
//Sum of digits: 45
