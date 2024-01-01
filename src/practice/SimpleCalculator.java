package practice;

public class SimpleCalculator { // creating a class called SimpleCalculator (public = access modifier - meaning it is
    // accessible from other classes (encapsulation concept of Java).
    public double calculateAverage(double num1, double num2) { // again public access modifier. double is the return
        // type of the method, indicating it returns a value of type double. double num1, double num2 - two
        //parameters, both of type double.
        double sum = num1 + num2; // creating variable sum of type double, assigning num1 + num2 to it.
        return sum / 2; // to return average of the two numbers.
    }

    public static void main(String[] args) { // main method --> static = the method belongs to the class
        // SimpleCalculator and not to a specific instance of SimpleCalculator. Void = method does not return any value
        SimpleCalculator calculator = new SimpleCalculator();
        double average = calculator.calculateAverage(10, 20);
        System.out.println("The average is: " + average);
    }
}
