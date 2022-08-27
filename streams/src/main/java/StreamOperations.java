import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {


        List<Integer> myList = Arrays.asList(1,2,3,4,3,5,7,85,9,1);
        myList.forEach(System.out::println);

        //FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(i -> i %3 == 0)
                .distinct()
                .forEach(System.out::println);

    }
}
