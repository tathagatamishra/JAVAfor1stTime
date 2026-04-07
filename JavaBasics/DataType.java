public class DataType {
    // 1. Byte datatype
    // void because not returning, just printing
    public void printByte() {

        // range is between -128 to 127
        byte age = 25;
        
        // print output
        System.out.println(age);
    }


    // 2. Short datatype
    public static void printShort() {

        short temp = 2000;

        System.out.println(temp);
    }

    // 3. Int datatype
    public static void printInt() {
        int population = 100000;

        System.out.println(population);
    }

    // 4. Long datatype
    public static void printLong() {

        long distanceToMoon = 400000000L;

        System.out.println(distanceToMoon);
    }

    // 5. Float datatype
    public static void printFloat() {

        float price = 69.67f;

        System.out.println(price);
    }

    // 6. Double datatype
    public static void printDouble() {

        // support 15 digit after point
        double successRate = 99.99;

        System.out.println(successRate);
    }

    // 7. Char datatype
    public static void printChar() {
        
        char keyPressed = 'W';

        System.out.println(keyPressed);
    }

    // 8. Boolean datatype
    public static void printBoolean() {

        boolean isRetarded = true;

        System.out.println(isRetarded);
    }


    // the main function
    public static void main(String[] args) {
        
        // creation a new object
        DataType myByte = new DataType();
        // because printByte is not static, I had to create an object
        // calling 
        myByte.printByte();

        // printShort is static, so object needed
        // directly called on class
        DataType.printShort();

        DataType.printInt();

        DataType.printLong();

        DataType.printFloat();

        DataType.printDouble();

        DataType.printChar();

        DataType.printBoolean();
    }
}
