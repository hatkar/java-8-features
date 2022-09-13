package com.hatmani;

import com.hatmani.MapFlatMap.Customer;
import com.hatmani.MapFlatMap.CustomerDatabase;

import java.util.List;

public class optionalDemo {
    public static Customer getCustomerById(int id)
    {
        List<Customer> customers = CustomerDatabase.getCustomers();
      return  customers.stream().filter(customer -> customer.getId()==id)
                .findAny().orElse(new Customer());

    }

    public static void main(String[] args) {
        System.out.println(getCustomerById(55));
    }
}
