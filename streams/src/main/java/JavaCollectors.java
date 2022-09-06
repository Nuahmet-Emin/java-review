import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        //toCollection(Supplier): is used to create collection using collector
        System.out.println("*********ToCollection*********");

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);
    List<Integer> numberList =    numbers.stream()
                .filter(x->x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet =    numbers.stream()
                .filter(x->x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList(): returns a Collectors interface that gathers the input data to a new list
        System.out.println("*********ToList*********");

        List<Integer> numberList2 = numbers.stream()
                .filter(x->x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        //toSet
        System.out.println("*********ToList*********");

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x->x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        //toMap(Function:Function): returns a Collectors interface that gathers the input data to a new map
        System.out.println("*********ToMap*********");

       Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);


        System.out.println("*********Counting*********");

        //counting(): returns a Collector that counts the number of the elements
        Long eventCount = numbers.stream()
                .filter(x->x % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(eventCount);

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a integer-valued func
        System.out.println("********SUMMINGINT()***********");
       Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

        //averagingInt(ToIntFunction) : returns the average of the integers passed values
      Double caloriesAvg = DishData.getAll().stream()
                .collect(Collectors.averagingDouble(Dish::getCalories));

        System.out.println(caloriesAvg);

        //joining() : is used to join various elements of a character or string array into a single string object
        System.out.println("********JOINING()***********");

        List<String> courses = Arrays.asList("java", "JS", "TS");
         String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        //partitioningBy() : is used to partition a stream of objects(or set of elements) based on a given predicate
        System.out.println("********PARTITIONINGBY()***********");
       Map<Boolean,List<Dish>>  veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        //groupingBy() : is used for grouping objects by some property and storing results in a map instance
        System.out.println("********GROUPINGBY()***********");
        Map<Type,List<Dish>> dishType=  DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType        ));
        System.out.println(dishType);




    }
}
