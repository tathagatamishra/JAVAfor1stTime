public class Operators {

    // Arithmetic Operators

    // 1. Addition
    public static void Addition() {
        int a = 5;
        int b = 3;

        System.out.println(a + b);
    }

    // 2. Subtraction
    public static void Subtraction() {
        int a = 5;
        int b = 3;

        System.out.println(a - b);
    }

    // 3. Multiplication
    public static void Multiplication() {
        int a = 5;
        int b = 3;

        System.out.println(a * b);
    }

    // 4. Division
    public static void Division() {
        int a = 5;
        int b = 3;

        System.out.println(a / b);
    }

    // 5. Modulus
    public static void Modulus() {
        int a = 5;
        int b = 3;
        // gives remainder of 2 values
        System.out.println(a % b);
    }

    // -----------------------------
    // Relational Operator

    // 1. Equal to
    public static void EqualTo() {
        int a = 5;
        int b = 3;

        System.out.println(a == b);
    }

    // 2. Not Equal to
    public static void NotEqualTo() {
        int a = 5;
        int b = 3;

        System.out.println(a != b);
    }

    // 3. Greater than
    public static void GreaterThan() {
        int a = 5;
        int b = 3;

        System.out.println(a > b);
    }

    // 4. Less than
    public static void LessThan() {
        int a = 5;
        int b = 3;

        System.out.println(a < b);
    }

    // 5. Greater than Equal to
    public static void GreaterEqualTo() {
        int a = 5;
        int b = 3;

        System.out.println(a >= b);
    }

    // 6. Less than Equal to
    public static void LessEqualTo() {
        int a = 5;
        int b = 3;

        System.out.println(a <= b);
    }

    // -----------------------------
    // Logical Operators

    // 1. AND
    public static void CheckBoth() {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
    }

    // 2. OR
    public static void EitherOr() {
        boolean a = true;
        boolean b = false;

        System.out.println(a || b);
    }

    // 3. NOT
    public static void ItsNot() {
        boolean a = true;

        System.out.println(!a);
    }

    public static void main(String[] args) {
        // Arithmetic Operators

        Operators.Addition();

        Operators.Subtraction();

        Operators.Multiplication();

        Operators.Division();

        Operators.Modulus();

        // Relational Operator

        Operators.EqualTo();

        Operators.NotEqualTo();

        Operators.GreaterThan();

        Operators.LessThan();

        Operators.GreaterEqualTo();

        Operators.LessEqualTo();

        // Logical Operators

        Operators.CheckBoth();

        Operators.EitherOr();

        Operators.ItsNot();
    }
}
