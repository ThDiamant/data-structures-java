package com.datastructures.stack.dynamic.arraybased;

import com.datastructures.stack.MyStack;

import java.util.ArrayList;
import java.util.EmptyStackException;

class MyDynamicArrayBasedStack<E> implements MyStack<E> {

    private final ArrayList<E> list;

    /**
     * Creates an empty stack
     */
    MyDynamicArrayBasedStack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public E peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return list.getLast();
    }

    public void push(E item) {
        list.add(item);
    }

    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        E topItem = list.getLast();
        list.removeLast();

        return topItem;
    }
}
