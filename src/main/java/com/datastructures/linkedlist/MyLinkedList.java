package com.datastructures.linkedlist;

/**
 * My interface for the linked list data structure. I have decided to only include the most important (for learning)
 * methods defined in Java's LinkedList interface:
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html">...</a>
 */
public interface MyLinkedList<E> {

    /**
     * @return true if the list is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * @return the number of elements in the list. If the list is empty it returns 0.
     */
    int size();

    /**
     * Removes all elements from the list.
     */
    void clear();

    /**
     * Appends an element to the end of the list.
     *
     * @param e element to be appended to the list.
     */
    void append(E e);

    /**
     * Inserts an element into the specified index. If the specified position is populated, the element at the current
     * position and any subsequent elements are shifted to the right. If the index does not exist, an appropriate
     * exception is thrown.
     *
     * @param index Index we want to insert the element to.
     * @param e Element we want to insert to the list.
     * @throws IndexOutOfBoundsException when the given index does not exist.
     */
    void insert(int index, E e) throws IndexOutOfBoundsException;

    /**
     * Removes and returns the element at a given index if it exists, otherwise it throws a relevant exception.
     *
     * @param index Index we want to remove the element at.
     * @return The removed element.
     * @throws IndexOutOfBoundsException when the given index does not exist.
     */
    E removeByIndex(int index) throws IndexOutOfBoundsException;

    /**
     * Returns the element at the given index if it exists, otherwise it throws a relevant exception.
     *
     * @param index Index we want to get the value of.
     * @return The element at the given index.
     * @throws IndexOutOfBoundsException when the given index does not exist.
     */
    E get(int index) throws IndexOutOfBoundsException;
}
