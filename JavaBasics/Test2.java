import java.util.ArrayList;
import java.util.List;

public class Test2 {
    
    // Creating a custom function

    public static void showFruits() {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");

        System.out.println(fruits);
    }


    // Calling my inside main function

    public static void main(String[] args) {
        showFruits();
    }

    // JVM calls main function automatically
}
