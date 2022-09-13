package com.hatmani.lambda.MapFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatmap {
//map prend un stream comme input et return stream son fonction produit un seul valeur pour chaque input
//->Data Transformation Stream.of("a","b","c")==>[A,B,C]

//flatMap =map+Flattering
//son fonction produit multiple valeur pour chaque input value
//  [[1,2],[3,4],[5,6]]==>[1,2,3,4,5,6]


    public static void main(String[] args) {
        List<Customer>customers = CustomerDatabase.getCustomers();
        //recuperer les email de customer
        List<String> names= customers.stream().map(c->c.getName()).collect(Collectors.toList());
        System.out.println(names);
        //recuperer les phones numbers
        List<List<String>>phonesNumbers = customers.stream().map(c->c.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phonesNumbers);
        List<String> phoneNumbersFlat= customers.stream()
                .flatMap(customer -> customer.getPhoneNumber().stream())
                .collect(Collectors.toList());
        System.out.println(phoneNumbersFlat);
    }
}
