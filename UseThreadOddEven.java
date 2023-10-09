package mypack;

//Create two threads to print odd numbers and even numbers from 1 to 100?

//note: after printing of all odd numbers only Even numbers should print.

//we use 2 classes in it which is odd & even thread class & simply we extends it by using a thread to reach towards the output.

class OddThread extends Thread //We take that thread class to print odd number
{
    public void run() //Override is done
    {
        for (int i = 1; i <= 100; i += 2) //We use for condition for printing odd Numbers
        {
            System.out.println("Odd: " + i); //prints odd numbers
            
        }
    }
}

class EvenThread extends Thread //We take that thread class to print even number
{
    public void run() //Override is done
    {
        for (int i = 2; i <= 100; i += 2) //We use for condition for printing even Numbers
        {
            System.out.println("Even: " + i); //prints even numbers
            
        }     
    }
}

public class UseThreadOddEven //Main class
{
    public static void main(String[] args) //Main method
    {
        OddThread oddThread = new OddThread();  //Create object of the OddThread and EvenThread classes
        EvenThread evenThread = new EvenThread();
        
        //Start both threads
        
        oddThread.start();   //it starts the execution of the run method in the OddThread
        evenThread.start();  //it starts the execution of the run method in the EvenThread
    }
}

//Output:-
//Odd: 1
//Odd: 3
//Odd: 5
//Odd: 7
//Odd: 9
//Odd: 11
//Odd: 13
//Odd: 15
//Till to 99 & then all even numbers is printed.
//Even: 2
//Even: 4
//Even: 6
//Even: 8
//Even: 10
//Even: 12
//Even: 14
//Even: 16
//Even: 18
//Till to 100 & finally the execution is stoped.