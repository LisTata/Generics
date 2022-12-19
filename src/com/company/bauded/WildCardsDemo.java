package com.company.bauded;

import java.util.ArrayList;
import java.util.List;

public class WildCardsDemo {
    public static void main(String[] args) {
        List<Animal> list1=new ArrayList<>();
        list1.add(new Pigeon());
        list1.add(new Pigeon());
        list1.add(new Cat());
       print(list1);


    }
    //Upper wildcard
    public static void print2(List<? extends Animal> list){
        System.out.println(list);
    }
    //Lower wildcard
    public static void print3(List<? super Pigeon> list){
        System.out.println(list);
    }
    //Unbounded wildcard
    public static void print(List<?> list){
        System.out.println(list);
    }
}
