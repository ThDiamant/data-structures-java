package com.datastructures.stack;

import java.util.EmptyStackException;

/**
 * My interface for the stack data structure. Similar to Java's (outdated) Stack interface for learning purposes.
 * Java interface: <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html">...</a>
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
     * Removes all elements from the queue.
     */
    void clear();

    /**
     * @return The top element in the stack. If the stack is empty, it throws an exception.
     */
    E peek() throws EmptyStackException;

    /**
     * Pushes an element to the top of the stack.
     *
     * @param item Item to be pushed in the stack.
     */
    void push(E item);

    /**
     * Retrieves and removes the top element from the stack. If the stack is empty the relevant exception is thrown.
     *
     * @return The popped item.
     * @throws EmptyStackException when the stack is empty.
     */
    E pop() throws EmptyStackException;
}
