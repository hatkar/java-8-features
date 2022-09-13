package com.hatmani.lambda;

import com.hatmani.lambda.MapFlatMap.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long start =0;
        long end =0;

        IntStream.range(1,100).forEach(System.out::println);
        List<Customer> customers = new ArrayList<>();
        for(int i =1;i<1000;i++)
        {

        }

    }

}
