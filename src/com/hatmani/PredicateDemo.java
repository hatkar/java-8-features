package com.hatmani;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateDemo {
    // c'est un interface fonctionel user pour conditional check
    //returning true/false
    //boolean test(T t)
    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> t % 2 == 0 ? true : false;
        System.out.println(predicate.test(10));

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
        integers.stream().filter(i->predicate.test(i)).forEach(t-> System.out.println(t));
        integers.stream().filter(i->i%2==0?true:false).forEach(t-> System.out.println(t));
        System.out.println("*********Map*********");
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));

    }
}
