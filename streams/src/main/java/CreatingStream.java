import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {


        //Creating Stream from Array
        String[] course = {"Java","JS","TS"};
        Stream<String> courseStream = Arrays.stream(course);


        //Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java","DS","Spring");
       Stream<String> courseStream2 =  courseList.stream();




    }
}
