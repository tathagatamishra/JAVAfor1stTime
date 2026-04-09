public class StringType {
    
    public static void main(String[] args) {
        
        // concatenation
        String firstName = "Johni";
        String lastName = "Stein";

        String fullName = firstName + " " + lastName;
        String japName = lastName.concat(" ").concat(firstName);

        System.out.println(fullName);
        System.out.println(japName);
        

        // comparison
        String txt1 = "Java";
        String txt2 = "C++";
        String txt3 = "java";

        boolean sameTxt = txt1.equals(txt3);

        boolean notSameTxt = txt1.equals(txt2);

        System.out.println(sameTxt);
        System.out.println(notSameTxt);


        // Extract substring
        String phrase = "Good game well played";

        String sub = phrase.substring(10, phrase.length());

        System.out.println(sub);


        // Split string
        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }


        // Join string
        String ggwp = String.join(" ", words);

        System.out.println(ggwp);


        // upper and lower case
        String userName = "  CYB3RPSYCH0  ";

        System.out.println(userName.toLowerCase());
        System.out.println(userName.toUpperCase());


        // trim
        userName = userName.trim();

        System.out.println(userName);


        // replace
        String glhf = ggwp.replace("game well played", "luck have fun");

        System.out.println(glhf);
    }
}
