public class Test3 {
    public static int RecMethod(int n) {
        int x = n + 1;

        if (x < 5) {
            return RecMethod(1);
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println(RecMethod(1));
    }
}
