package com.datastructures.stack;

import java.util.NoSuchElementException;

/**
 * My interface for the stack data structure.
 */
public interface MyStack<E> {

    /**
     * @return true if the stack is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * @return the number of elements in the stack. If the stack is empty it returns 0.
     */
    int size();

    /**
     * @return The top element in the stack. If the stack is empty, it throws an exception.
     */
    E top() throws NoSuchElementException;

    /**
     * Pushes an element in the stack. If the stack is fixed size and full when this method is called, it throws an
     * appropriate exception.
     */
    void push(E item);

    /**
     * Removes the top element from the stack. If the stack is empty when this method is called, it throws an exception.
     */
    void pop() throws NoSuchElementException;
}
