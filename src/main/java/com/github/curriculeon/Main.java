package com.github.curriculeon;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date x = new Date();
        Date y = new Date();
        System.out.println(new Date() +", "+ new Date() +", "+ new Date());
        System.out.println(x.equals(y) );


        MySet<Integer> mySet = new MySet<>();
        mySet.add("The");
        mySet.add("Brown");
        mySet.add("Fox");
        mySet.add("The");
        System.out.println( mySet.size() );
    }
}
