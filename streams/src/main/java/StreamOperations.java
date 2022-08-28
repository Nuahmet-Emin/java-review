import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {


        List<Integer> myList = Arrays.asList(1,2,3,4,3,5,7,85,9,1,44);
        myList.forEach(System.out::println);

        //FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(i -> i %3 == 0)
                .distinct()
                .forEach(System.out::println);

        //LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .filter(i-> i %2 == 0)
                .limit(1)
                .forEach(System.out::println);
        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i-> i % 2 == 0)
                .skip(2)
                .forEach(System.out::println);

        //MAP
        System.out.println("MAP");
        myList.stream()
                .map(x-> x *2)
                .filter(i-> i %3 == 0)
                .forEach(System.out::println);

        //Task
        System.out.println("TASK");
        //print number of characters for each word

        List<String> words = Arrays.asList("Java","Apple","HONDA","Developer");
        //my solution
        words.stream().forEach(x-> System.out.println(x +": " + x.length()));

        words.stream()
                .map(String::length)
                .forEach(System.out::println);




    }
}
