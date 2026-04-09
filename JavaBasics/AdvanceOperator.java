public class AdvanceOperator {

    public static void main(String[] args) {
        
        // Assignment Operators
        int a = 10;
        a += 5;
        a -= 2;
        a *= 3;
        a /= 2;
        a %= 5;

        System.out.println(a);
        
        // Unary Operators
        
        int b = 5;
        b = +b;
        b = -b;

        System.out.println(b);
        
        // Increment
        int c = 6;
        ++c;
        System.out.println(c);
        c++;
        System.out.println(c);
        
        // Decrement
        --c;
        System.out.println(c);
        c--;
        System.out.println(c);
        
        // Ternary Operators
        // condition ? expression1 : expression2;
        int x = 5;
        int y = 8;

        int max = (x > y) ? x : y;

        System.out.println(max);
    }
}
