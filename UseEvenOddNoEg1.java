package mypack;

//Write a program to create thread. Where you will take the input from the user and find if the number is odd or even

import java.util.Scanner;//Use scanner class for take the input from the user

class OddEvenThread extends Thread
{
    private int number;//data member

    public OddEvenThread(int number)
    
    {
        this.number = number;
    }

    
    public void run() //Override is done
    {
        if (number % 2 == 0)//if-else condition is used for printing even-odd numbers
        {
            System.out.println(number + " is an even number.");//prints even numbers
        }
        else
        {
            System.out.println(number + " is an odd number.");//prints odd numbers
        }
    }
}

public class UseEvenOddNoEg1//Main class
{
    public static void main(String[] args)//Main method
    {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // In this user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create the thread and start it
        OddEvenThread thread = new OddEvenThread(number);
        thread.start();

        // Wait for the thread to finish
        try //try & catch is used
        {
            thread.join();//join() is used
        }
        catch (InterruptedException e)//InterruptedException is used
        {
            e.printStackTrace();
        }

        // Print a message shows that the main thread has finished
        System.out.println("Main thread has finished.");

        // Close the Scanner
        scanner.close();
    }
}

//Output:-
//Enter a number: 26
//26 is an even number.
//Main thread has finished.
