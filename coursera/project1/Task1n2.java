// Task 1: String array of items

// Create a String array of items you will buy from a grocery shop. 
// It should be a minimum of 10, but not more than 25.

public class Task1n2 {
    public static void main(String[] args) {

        String[] items = new String[25];
        float[] price = new float[25];

        items[0] = "cpu";           price[0] = 18000.00f;
        items[1] = "ram";           price[1] = 6000.00f;
        items[2] = "gpu";           price[2] = 70000.00f;
        items[3] = "ssd";           price[3] = 10000.00f;
        items[4] = "motherboard";   price[4] = 20000.00f;
        items[5] = "psu";           price[5] = 10000.00f;
        items[6] = "cabinet";       price[6] = 3000.00f;
        items[7] = "monitor";       price[7] = 40000.00f;
        items[8] = "keyboard";      price[8] = 1000.00f;
        items[9] = "mouse";         price[9] = 1000.00f;
        items[10] = "headset";      price[10] = 600.00f;
        items[11] = "hdd";          price[11] = 5000.00f;
        items[12] = "cooler";       price[12] = 4000.00f;

        for (int i = 0; i < items.length; i++) {
            
            if (items[i] != null) {
                System.out.println(items[i] + ": " + price[i]);
            } else {
                continue;
            }
        }
    }
}
