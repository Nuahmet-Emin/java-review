package functionalinterfaces;

import lombok.Student;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(User.builder().firstName("Nurahemt").lastName("Azat").age(1).build());
        list.add(User.builder().firstName("Aidana").lastName("Azat").age(3).build());
        list.add(User.builder().firstName("Dilfinar").lastName("Emin").age(3).build());


        //Print all element sin the list
        printName(list,p -> true);
        System.out.println("---------------------------------");
        printName(list, p-> p.getLastName().startsWith("E"));


        /* my solution
        Consumer<User> printUsers=  p-> System.out.println(p);
        for (User user : list) {
            printUsers.accept(user);
        }*/

        //Print all users that last name starts with E
      /* Predicate<User> nameStartsWithE = p ->
            p.getLastName().startsWith("E");
        System.out.println(p);*/


    }

    private static void printName(List<User> users, Predicate<User> p){
        for (User user : users) {
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
