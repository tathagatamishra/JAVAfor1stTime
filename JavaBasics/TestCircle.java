import myShapePackage.CircleShape;

public class TestCircle {
    public static void main(String[] args) {
        CircleShape myCircle = new CircleShape(5.0);
        
        System.out.println(myCircle.area());
    }
}
