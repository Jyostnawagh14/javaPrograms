package mypack;

//Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.

//Formula:

//Perimeter of a square = 4 * s

//Perimeter of a rectangle = 2 * (l + b)

//Perimeter of a circle = 2 * (22/7) * r

//we use different parameters for the three methods to achieve function overloading & we uses separate methods for each shape. 

class Perimeter //Class name
{
    // Calculate perimeter of a square
    public double calculatePerimeter1(double side)  //1st method with parameter double with side
    {
        return 4 * side; //by using formula Perimeter of a square = 4 * s
    }

    // Calculate perimeter of a rectangle
    public double calculatePerimeter2(double length, double breadth)  //2nd method with parameter double with length & breadth
    {
        return 2 * (length + breadth); //by using formula Perimeter of a rectangle = 2 * (l + b)
    }

    // Calculate perimeter of a circle
    public double calculatePerimeter3(double radius)  //3rd method with parameter double with radius
    {
        return 2 * (22 / 7) * radius; //by using formula Perimeter of a circle = 2 * (22/7) * r
    }
}

public class UsePerimeter1 //Main class
{
    public static void main(String[] args) //Main method
    {
        Perimeter perimeterCalculator = new Perimeter(); //Object is created

        //it used to print the Perimeter of a square
        double squarePerimeter = perimeterCalculator.calculatePerimeter1(5); //Assign the value for output
        System.out.println("Perimeter of the square: " + squarePerimeter);  //it prints Perimeter of a square

        //it used to print the Perimeter of a rectangle
        double rectanglePerimeter = perimeterCalculator.calculatePerimeter2(6, 8); //Assign the values for output
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);  //it prints Perimeter of a rectangle

        //it used tio print Perimeter of a circle
        double circlePerimeter = perimeterCalculator.calculatePerimeter3(3); //Assign the values for output
        System.out.println("Perimeter of the circle: " + circlePerimeter);  //it prints Perimeter of a circle
    }
}

//Output:-
//Perimeter of the square: 20.0
//Perimeter of the rectangle: 28.0
//Perimeter of the circle: 18.0
