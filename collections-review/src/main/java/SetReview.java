import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

    // 1. creat a set
        Set<Student> mySet = new HashSet<>();
        //2. add element
        mySet.add(new Student(7,"Nurahmet"));
        mySet.add(new Student(7,"John"));
        mySet.add(new Student(7,"Jackson"));
        mySet.add(new Student(7,"Jackson"));



        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));

        System.out.println(" solution 1-----------------------------------------");


        System.out.println("first repeating: "+ firstRepeatingChar("java developer"));


        System.out.println("My solution-----------------------------------------");

        Set<Character> charSet = new HashSet<>();
        String str = "Java Developer";
        for (char ch : str.toCharArray()) {
            if(charSet.add(ch) == false){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("nur");



    }

    public static Character firstRepeatingChar(String str) {
        //create hashmap
        Set<Character> myChars = new HashSet<>();

        //iteration return ch if add returns false
        for (Character ch : str.toCharArray()) if (!myChars.add(ch)) return ch;
        return null;
    }

}
