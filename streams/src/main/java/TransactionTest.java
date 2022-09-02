import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

import static java.util.Comparator.comparing;

public class TransactionTest {

    //1- find all transaction in 2011 and sort by value


    public static void main(String[] args) {
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("*********Unique city**********");


        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("***********************");

        //3. find all traders from Cambridge and sort them by name
        TransactionData.getAll().stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(t->t.getTrader().getName()))
                .forEach(System.out::println);

        System.out.println("***********************");


        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(t->t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);
        System.out.println("******Task-4************");

        //4- Return a string of all trader's names sorted alphabetically
       /* TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        */

      String result =   TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1,name2)->name1 + name2) + " ";
        System.out.println(result);

        //5- Are any traders based in Milan?
        System.out.println("******Task-5************");
        Boolean isMilan = TransactionData.getAll().stream()
                .anyMatch(t->t.getTrader().getCity()=="Milan");
        System.out.println(isMilan);

        //6- Print the values of all transactions from the traders living in Cambridge
        System.out.println("******Task-6************");

        TransactionData.getAll().stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .map(t->t.getValue())
                .forEach(System.out::println);

       /*int total=  TransactionData.getAll().stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .map(t->t.getValue())
                .reduce(0,(t1,t2)-> t1+t2);
        System.out.println(total);*/



        //7 - What is the highest value of all the transactions
        System.out.println("******Task-7************");
       Optional<Integer> highestValue = TransactionData.getAll().stream()
                .map(t->t.getValue())
                .reduce(Integer::max);
        System.out.println(highestValue.get());


        //8-Find the transaction with the smallest value
        System.out.println("******Task-8************");
       Optional<Transaction> smValue = TransactionData.getAll().stream()
                .reduce((t1,t2)-> t1.getValue()<t2.getValue()?t1 : t2);

        System.out.println(smValue.get());

        Optional<Transaction> smValue2 = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smValue2.get());




























    }
}
