package mypack;

//WAP to search a particular element in the given array.

import java.util.Scanner;

public class ArraySearch1 //Class name
{
    public static void main(String[] args) //Main method
    {
        Scanner scanner = new Scanner(System.in); //it is used to take user input
        
        System.out.print("Enter the size of the array: "); //We can enter the size of an array
        int size = scanner.nextInt();
        
        int[] arr = new int[size]; //In this we can create an array of the specified size
        
        System.out.println("Enter the array elements:"); //In this we can enter the array elements
        for (int i = 0; i < size; i++)  //In this we can use the for condition
        {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search for: "); //It take input of the elements to search
        int target = scanner.nextInt();
        
        boolean found = false; //In this we can perform linear search
        for (int i = 0; i < size; i++)
        {
            if (arr[i] == target)
            {
                found = true; //if it found true then the searching is stopped
                break; // If element is found, no need to continue searching
            }
        }
        
        if (found) //if-else condition is used to display the search result
        {
            System.out.println("Element " + target + " found in the array.");//if element is found it prints elements found in the array
        }
        else
        {
            System.out.println("Element " + target + " not found in the array.");///if element is not found it prints elements not found in the array
        }
        
        scanner.close(); //close the program
    }
}

//Output:-
//if element is found in the array
//Enter the size of the array: 5
//Enter the array elements:
//11
//32
//56
//10
//18
//Enter the element to search for: 56
//Element 56 found in the array.

//if element is not found in the array
//Enter the size of the array: 6
//Enter the array elements:
//10
//25
//23
//36
//30
//41
//Enter the element to search for: 12
//Element 12 not found in the array.

