// Task 5: Create for inner infinite loop for purchases
// Create an infinite loop that runs as long as the user wants to add items. 
// The loop should exit when the user inputs Complete (ignoring the case).

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        String[] shop = new String[10];
        float[] price = new float[10];

        shop[0] = "R6";
        price[0] = 699.0f;
        shop[1] = "COD";
        price[1] = 2000.0f;
        shop[2] = "PUBG";
        price[2] = 0.0f;
        shop[3] = "DBD";
        price[3] = 1159.0f;
        shop[4] = "CS2";
        price[4] = 0.0f;
        shop[5] = "GTA5";
        price[5] = 2499.0f;
        shop[6] = "RDR2";
        price[6] = 4999.0f;
        shop[7] = "RE9";
        price[7] = 4399.0f;
        shop[8] = "NFS";
        price[8] = 1000.0f;
        shop[9] = "POE2";
        price[9] = 2532.0f;

        System.out.println("Products available:\n");

        for (int i = 0; i < shop.length; i++) {

            System.out.println(shop[i] + ": " + price[i]);
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("\nType item name and click enter to add in cart");
        System.out.println("\nClick Enter key and add more item");
        System.out.println("\nOr type Yes and click enter to confirm");

        while (true) {

            String input = scan.nextLine();

            float total = 0.0f;

            if (input.toLowerCase().equals("yes")
                    || input.toLowerCase().equals("y")) {

                System.out.println("Total amount: ");
                scan.close();
                break;
            }

            for (int i = 0; i < shop.length; i++) {

                if (input.toLowerCase().equals(shop[i])) {

                    // System.out.println(shop[i]);
                    break;
                }
            }

        }
    }
}
