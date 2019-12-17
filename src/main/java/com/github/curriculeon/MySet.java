package com.github.curriculeon;

import java.util.*;
import java.util.function.Consumer;

public class MySet<SomeType> implements MyCollectionInterface{
    Set<SomeType> mySet;

    public MySet() {
        mySet = new HashSet<>();
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        mySet = new HashSet<>(Arrays.asList(valuesToBePopulatedWith));
    }

    @Override
    public void add(Object objectToAdd) {
        mySet.add((SomeType) objectToAdd);
    }

    @Override
    public void remove(Object objectToRemove) {
        mySet.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        mySet.remove(indexOfObjectToRemove)
    }

    @Override
    public Object get(int indexOfElement) {
        return mySet.get(indexOfElement);
    }

    @Override
    public Boolean contains(Object objectToCheckFor) {
        return null;
    }

    @Override
    public Integer size() {
        return null;
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
}
