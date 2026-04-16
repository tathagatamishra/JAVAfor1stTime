class Calculator {

    public int add(int a, int b) {

        System.out.println("test");
        return a + b;
    }
}

public class Test5 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        Calculator calc = new Calculator();

        int result = calc.add(x, y);

        System.out.println(result);
    }
}
