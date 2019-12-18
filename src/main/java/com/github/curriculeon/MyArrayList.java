package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<SomeType> implements MyCollectionInterface {

    private ArrayList<SomeType> myArrayList;

    public MyArrayList() {
        myArrayList =  new ArrayList<>();
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        myArrayList = new ArrayList<>(Arrays.asList(valuesToBePopulatedWith));
    }

    @Override
    public void add(Object objectToAdd) {
        myArrayList.add((SomeType) objectToAdd);
    }

    @Override
    public void remove(Object objectToRemove) {
        myArrayList.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        myArrayList.remove(indexOfObjectToRemove);
    }

    @Override
    public Object get(int indexOfElement) {
        return myArrayList.get(indexOfElement);
    }

    @Override
    public Boolean contains(Object objectToCheckFor) {
        return myArrayList.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return myArrayList.size();
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
        return "MyArrayList{" +
                "myArrayList=" + myArrayList +
                '}';
    }
}
