package com.hatmani.lambda;

import com.hatmani.lambda.MapFlatMap.Customer;
import com.hatmani.lambda.MapFlatMap.CustomerDatabase;

import java.util.Arrays;
import java.util.List;

public class mapReduceDemo {
    //ce model serve pour mape(transformer data)
    //et Reduce (Aggregate data)
    //Cimbine elements de stream et produire un seule valeur
    //exp sum avg
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,5,8,9);
      int sum=  numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum);
        Integer reduceSum=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(reduceSum);
        Integer reduceSumRef=numbers.stream().reduce(0,Integer::sum);
        System.out.println(reduceSumRef);
        Integer max=numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("Maximum "+max);
        Integer Min = numbers.stream().reduce(Integer::min).get();
        System.out.println("Min "+Min);

        //get Employe with grade A
        //get Salary moyen
        List<Customer> customers = CustomerDatabase.getCustomers();
Double salaryavg= customers.stream().filter(customer -> customer.getGrade().equalsIgnoreCase("A"))
        .mapToInt(i->i.getSalary())
        .average().getAsDouble();
        System.out.println(salaryavg);

    }
}
