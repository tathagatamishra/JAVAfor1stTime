public class StringType {
    
    public static void main(String[] args) {
        
        // concatenation
        String firstName = "Johni";
        String lastName = "Stein";

        String fullName = firstName + " " + lastName;
        String japName = lastName.concat(" ").concat(firstName);

        System.out.println(fullName);
        System.out.println(japName);
        

        String txt1 = "Java";
        String txt2 = "C++";
        String txt3 = "java";

        boolean sameTxt = txt1.equals(txt3);

        boolean notSameTxt = txt1.equals(txt2);

        System.out.println(sameTxt);
        System.out.println(notSameTxt);
    }
}
