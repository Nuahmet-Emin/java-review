package functionalinterfaces;

import java.util.function.*;

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

        //**********Supplier*********//

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

         Predicate<Integer> pred = (p) -> p % 2 == 0? true: false;
        System.out.println(pred.test(10));

     BiConsumer<Integer,String> bn =  (x,y)-> System.out.println(x+y  );
      bn.accept(4,"Apple");

    }
}
