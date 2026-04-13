// Task 3: Import and create a Scanner object
// Import and create a scanner object and create an object of scanner object to read from the console.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);        
        
        System.out.println("Enter your name: ");
        String name = scan.next();

        System.out.println("Hi, " + name + "!");

        scan.close();
    }
}
