package practice;

public class Greeter {
    public static void main(String[] args) {
        // Check if at least one argument is provided.
        if (args.length > 0) {
            String name = args[0]; // creating variable (String) called name,
            // setting this to be equal to the first indexpos in the string-array
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, stranger!");
        }
    }
}
