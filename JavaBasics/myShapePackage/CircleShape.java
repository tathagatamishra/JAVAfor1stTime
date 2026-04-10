package myShapePackage;

public class CircleShape {

    private double CircleRadius;

    // constructor name matches class name
    public CircleShape(double radius) {
        
        // field name matches declaration
        this.CircleRadius = radius;
    }

    // instead of doing all these
    // I can just pass double radius as argument in area()
    public double area() {
        return Math.PI * CircleRadius * CircleRadius;
    }

    // no fluf, its better
    public static double ezArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        
        System.out.println(ezArea(5.0));
    }
}