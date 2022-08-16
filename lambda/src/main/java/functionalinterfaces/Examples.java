package functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Examples {
    public static void main(String[] args) {

        //**********Predicate*********//
        //anonymous class
        /*Predicate<Integer>  lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer<18;
            }
        };
        System.out.println(lesserThan.test(40));*/


        Predicate<Integer> lesserThan =  a ->  a<18; // implementation of test method that belongs to Predicate interface
        System.out.println(lesserThan.test(8));

        //**********Consumer*********//

        Consumer<Integer> display =  i -> System.out.println(i);
        display.accept(1);

        //**********BiConsumer*********//

        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(2,5);

        //**********Function*********//

        Function<String,String> function = s -> "Hello " + s;
        System.out.println(function.apply("Nurahmet"));


    }
}
