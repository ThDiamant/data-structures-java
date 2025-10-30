package com.datastructures.stack.dynamic.arraybased;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyDynamicArrayBasedStack {

    private final ArrayList<Object> list;

    MyDynamicArrayBasedStack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public Object top() throws NoSuchElementException {
        return list.getLast();
    }

    public void push(Object obj) {
        list.add(obj);
    }

    public void pop() throws NoSuchElementException {
        list.removeLast();
    }
}
