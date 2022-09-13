package com.hatmani;

import java.util.function.Supplier;

public class SupplierDemo {
    //utiliser quand il nya pas d'input mais un un output is expected
    //T get();
    public static void main(String[] args) {
        Supplier<String> supplier=()-> "Hi This Karim!";
        System.out.println(supplier.get());
    }
}
