package mypack;

//Create a thread and set its priority to 7 and print the priority of all the threads.
public class ThreadPriorityExample //Class name
{
    public static void main(String[] args)//Main method
    {
        // Create a new thread and set its priority to 7 by using lambda expression
    	
        Thread thread = new Thread(() -> {
            System.out.println("This is a high priority thread.");
        });
        thread.setPriority(7);

        // Start the thread
        
        thread.start();

        // Get and print the priority of all threads
        
        Thread mainThread = Thread.currentThread();
        
        System.out.println("Priority of main thread: " + mainThread.getPriority());
        System.out.println("Priority of created thread: " + thread.getPriority());
    }
}

//Output:-
//Priority of main thread: 5
//This is a high priority thread.
//Priority of created thread: 7


