package com.github.curriculeon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyMap<KeyType, ValueType> implements MyMapInterface {
    Map<KeyType, ValueType> myMap;

    public MyMap() {
        myMap = new HashMap<>();
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        myMap = new HashMap<KeyType,ValueType>((Map<? extends KeyType, ? extends ValueType>) entries);
    }

    @Override
    public void put(Object key, Object value) {

    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Set getKeySet() {
        return null;
    }

    @Override
    public List getValues() {
        return null;
    }

    @Override
    public Set<KeyValue> getKeyValues() {
        return null;
    }

    @Override
    public MyMapInterface invert() {
        return null;
    }
}
