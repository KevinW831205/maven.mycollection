package com.github.curriculeon;

import java.util.*;
import java.util.function.Consumer;

public class MySet<SomeType> implements MyCollectionInterface{
    ArrayList<SomeType> mySet;

    public MySet() {
        mySet = new ArrayList<>();
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        mySet = new ArrayList<>();
        for(SomeType i : valuesToBePopulatedWith){
            if(!mySet.contains(i)){
                mySet.add((SomeType) i);
            }
        }

    }

    @Override
    public void add(Object objectToAdd) {
        if(!mySet.contains(objectToAdd)){
            mySet.add((SomeType) objectToAdd);
        }
    }

    @Override
    public void remove(Object objectToRemove) {
        mySet.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        mySet.remove(indexOfObjectToRemove);
    }

    @Override
    public Object get(int indexOfElement) {
        return mySet.get(indexOfElement);
    }

    @Override
    public Boolean contains(Object objectToCheckFor) {
        return mySet.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return mySet.size();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public String toString() {
        return "MySet{" +
                "mySet=" + mySet +
                '}';
    }
}
