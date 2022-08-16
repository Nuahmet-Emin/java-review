package functionalinterfaces;

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

    }
}
