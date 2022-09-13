package com.hatmani;

import com.hatmani.MapFlatMap.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    private static  List<Customer> getCustomers(){
        List<Customer> customers = new ArrayList<>();
        for(int i =1;i<1000;i++)
        {
            customers.add(new Customer(i,"employe"+i,i*100,"A",null));
        }
        return  customers;
    }
    public static void main(String[] args) {
        long start =0;
        long end =0;

        IntStream.range(1,100).forEach(System.out::println);
        List<Customer>customers=getCustomers();
        start=System.currentTimeMillis();
        Double avgSalary=customers.stream().map(Customer::getSalary)
                .mapToDouble(i->i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println(avgSalary);
        System.out.println("With Normal Stream ,salary calculed in "+(end-start)+" second");
        start=System.currentTimeMillis();
        Double avgSalaryparall=customers.parallelStream().map(Customer::getSalary)
                .mapToDouble(i->i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println(avgSalaryparall);
        System.out.println("With parallel Stream ,salary calculed in "+(end-start)+" second");

    }

}
