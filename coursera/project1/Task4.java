// Task 4: Create infinite loop
// Create an infinite loop that runs as long as the user wants the loop to run. 
// The loop should exit when the user inputs Exit (ignoring the case).

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 'Exit' to quit: ");

        while (true) {
            String input = scan.nextLine();

            if (input.toLowerCase().equals("exit")) {
                
                break;
            }
            
            System.out.println(input);
        }

        scan.close();

        System.out.println("Loop ended");
    }
}
