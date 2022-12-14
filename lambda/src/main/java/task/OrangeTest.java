package task;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

    }


        //behaviour
      /*  OrangeFormatter simpleFormatter =  orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintOrange(inventory,simpleFormatter);

        prettyPrintOrange(inventory,orange -> "An orange of " + orange.getWeight() + "g");

        System.out.println("-------------------------");

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy": "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };
        System.out.println("-------------------------");


        prettyPrintOrange(inventory, orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy": "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        });
    }*/
/*
    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange : inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }*/




    private static void prettyPrintOrange(List<Orange> inventory, Predicate<Orange> p) {

        for (Orange orange : inventory) {
            if(p.test(orange)  ){
                System.out.println(orange.toString());
            }
        }

    }
}
