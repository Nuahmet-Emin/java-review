import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
      int result =   numbers.stream().reduce(1,(a,b)-> a+b);
        System.out.println(result);

        //No Initial Value
      Optional<Integer>  result2 =numbers.stream().reduce((a, b)-> a+b);
        System.out.println(result2.get());

        //Max and Min
      Optional<Integer> min =  numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());


        //Task: count the number of dish from the dish data
       int dishCount = DishData.getAll().stream().map(dish -> 1 ).reduce(0,(a,b)-> a+b);
        System.out.println(dishCount);

       long dCount = DishData.getAll().stream().count();
        System.out.println(dCount);


    }
}
