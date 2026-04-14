import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {

        // Scanner scan1 = new Scanner(System.in);

        // System.out.println("Enter your name: ");
        // String name = scan1.next();

        // System.out.println("\nHi, " + name + "!\n");

        // scan1.close();

        // ------------------------------------

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

        float total = 0.0f;

        System.out.println("\nType item name and click enter to add in cart");
        System.out.println("Click Enter key and add more item");
        System.out.println("Or type Yes and click enter to confirm");
        System.out.println("Or Enter 'Exit' to quit\n");

        Scanner scan2 = new Scanner(System.in);
        String input = scan2.nextLine();

        while (true) {

            if (input != null) {
                for (int i = 0; i < shop.length; i++) {

                    if (input.equalsIgnoreCase(shop[i].toLowerCase())) {

                        total = total + price[i];
                        break;
                    }
                }

                if (input.equalsIgnoreCase("yes")
                        || input.equalsIgnoreCase("y")) {

                    System.out.println("Total price: " + total);
                    scan2.close();
                    break;
                }
                
                if (input.toLowerCase().equals("exit")) {

                    System.out.println("Loop ended");
                    scan2.close();
                    break;
                }
            }

        }
    }
}
