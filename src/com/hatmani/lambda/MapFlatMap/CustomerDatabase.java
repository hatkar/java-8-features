package com.hatmani.lambda.MapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {
    public static List<Customer> getCustomers()
    {
        return Stream.of(
                new Customer(101,"Karim",1200,"A", Arrays.asList("20334895","55334895")),
                new Customer(102,"Jhon",3200,"B", Arrays.asList("65424645","55334895")),
                new Customer(103,"Sam",4500,"A", Arrays.asList("20334895","55334895")),
                new Customer(104,"Pedro",1300,"A", Arrays.asList("20334895","55334895"))


                ).collect(Collectors.toList());
    }
}
