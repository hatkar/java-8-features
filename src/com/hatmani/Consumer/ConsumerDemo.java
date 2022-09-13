package com.hatmani.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    //Consumer Interface est utilise quand un objet est consomme
    // en input et on fait qulque operation sur ce objet
    // sans retourner aucun resultat
    //void accept(T t)
    public static void main(String[] args) {
        Consumer<Integer> consumer =(t)-> System.out.println("Printing : "+t);
        consumer.accept(10);
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
        integers.stream().forEach(i-> consumer.accept(i));
    }
}
