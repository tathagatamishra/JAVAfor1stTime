public class Conditional {
    
    public static void main(String[] args) {
        
        int age = 25;

        // if-else statement
        if (age >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Can not vote");
        }

        // if-elseif-else statement
        if (age > 20) {
            System.out.println("You are good");
        } else if (age > 40) {
            System.out.println("You unced out");
        } else {
            System.out.println("Hey kid go home");
        }

        // nested if statement
        float height = 5.6f;

        if (age >= 18 && age <=40) {
            if (height > 5.5f) {
                System.out.println("Join Army");
            } else {
                System.out.println("Nah bro");
            }
        } else {
            System.out.println("Go home");
        }

        // switch statement
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        
            default:
                System.out.println("What a day!");
                break;
        }
    }
}
