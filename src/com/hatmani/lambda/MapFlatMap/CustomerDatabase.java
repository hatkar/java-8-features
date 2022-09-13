package com.hatmani.lambda.MapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {
    public static List<Customer> getCustomers()
    {
        return Stream.of(
                new Customer(101,"Karim", Arrays.asList("20334895","55334895")),
                new Customer(102,"Jhon", Arrays.asList("65424645","55334895")),
                new Customer(103,"Sam", Arrays.asList("20334895","55334895")),
                new Customer(104,"Pedro", Arrays.asList("20334895","55334895"))


                ).collect(Collectors.toList());
    }
}
