package com.datastructures.stack.dynamic.arraybased;

import com.datastructures.stack.MyStack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

class MyDynamicArrayBasedStack<E> implements MyStack<E> {

    private final ArrayList<E> list;

    MyDynamicArrayBasedStack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public E top() throws NoSuchElementException {
        return list.getLast();
    }

    public void push(E item) {
        list.add(item);
    }

    public void pop() throws NoSuchElementException {
        list.removeLast();
    }
}
