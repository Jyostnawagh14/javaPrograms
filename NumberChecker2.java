package mypack;

//Write a simple program to create odd-even numbers by using threads

//We create a class that implements the Runnable interface

class NumberCheckerRunnable implements Runnable
{
 private int number; //Data member declared wioth private

 // Constructor is used to check the number
 public NumberCheckerRunnable(int number)
 {
     this.number = number;
 }

 //We Override the run() method to perform the odd/even check
 
 public void run() //Override is done
 {
     if (number % 2 == 0)//We take if-else statements for writing condition of even-odd numbers
     {
         System.out.println(number + " is an even number.");//Prints even number
     }
     
     else
     {
         System.out.println(number + " is an odd number.");//Prints odd number
     }
 }
}

public class NumberChecker2 // Main Class name
{
 public static void main(String[] args)//Main method
 {
     int number1 = 11;//2 values is taken
     int number2 = 16;

     //We Create instances of the Runnable class 
     NumberCheckerRunnable runnable1 = new NumberCheckerRunnable(number1);
     NumberCheckerRunnable runnable2 = new NumberCheckerRunnable(number2);

     Thread thread1 = new Thread(runnable1);//Create thread 1 & 2 from runnable class
     Thread thread2 = new Thread(runnable2);

     thread1.start(); // We Start the threads for the final results
     thread2.start();
 }
}
