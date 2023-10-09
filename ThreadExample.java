package mypack;

//Create a thread to find the average of the first 50 numbers and other thread is printing square of number store in array arr={10,15,20,25,30}.

class AverageThread extends Thread

{
 
 public void run()//Override is done
 {
     int sum = 0;
     for (int i = 1; i <= 50; i++)//taking for loop
     {
         sum += i;
     }
     double average = (double) sum / 50;//avg = total sum/50
     System.out.println("The average of the first 50 numbers is: " + average);//prints avg of 1st 50 numbers
 }
}

//Create a thread to print the squares of numbers in the array
class SquareThread extends Thread
{
 private int[] arr;//data members

 public SquareThread(int[] arr)
 {
     this.arr = arr;
 }

 @Override
 public void run()//Override is done
 {
     System.out.print("Squares of numbers in the array: ");//squares of no.s in the array
     for (int num : arr)
     {
         int square = num * num;//square = num * num
         System.out.print(square + " ");//prints the squares of no.s
     }
     System.out.println();
 }
}

public class ThreadExample
{
 public static void main(String[] args)//Main method
 {
     int[] arr = {10, 15, 20, 25, 30};//No of arr is defined

     // Creating threads
     AverageThread averageThread = new AverageThread();
     SquareThread squareThread = new SquareThread(arr);

     // Starting threads
     averageThread.start();
     squareThread.start();

     //  We uses try & catch block & Waiting for both threads to finish
     try
     {
         averageThread.join();
         squareThread.join();
     }
     catch (InterruptedException e)//InterruptedException is taken
     {
         e.printStackTrace();//it will handle error or exceptions
     }

     System.out.println("Both threads have finished their tasks.");//final msg is prints
 }
}

//Output:-
//Squares of numbers in the array: 100 225 400 625 900 
//The average of the first 50 numbers is: 25.5
//Both threads have finished their tasks.



