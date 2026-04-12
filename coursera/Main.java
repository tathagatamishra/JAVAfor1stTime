public class Main {
    public static int compute() {
        try {
            return 5;
        } catch (ArithmeticException e) {
            return 8;
        } finally {
            return 12;
        }
    }

    public static void main(String[] args) {
        System.out.println(compute());
    }
}