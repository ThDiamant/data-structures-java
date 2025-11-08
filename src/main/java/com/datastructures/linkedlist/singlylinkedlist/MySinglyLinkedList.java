package com.datastructures.linkedlist.singlylinkedlist;

import com.datastructures.linkedlist.MyLinkedList;
import com.datastructures.linkedlist.MyNode;

class MySinglyLinkedList<E> implements MyLinkedList<E> {

    private MyNode<E> head;
    private MyNode<E> tail;
    private int size = 0;

    private void init(E e) {
        this.head = new MyNode<>(e);
        this.head.setNext(null);
        this.tail = this.head;
        this.size = 1;
    }

    MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    MySinglyLinkedList(E e) {
        init(e);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        validateIndex(index);

        MyNode<E> node = getNodeAtIndex(index);

        return node.getData();
    }

    private MyNode<E> getNodeAtIndex(int index) {
        int c = 0;
        MyNode<E> node = this.head;
        while (c != index) {
            node = node.getNext();
            c += 1;
        }

        return node;
    }

    @Override
    public void append(E e) {
        if (isEmpty()) {
            init(e);
        } else {
            this.tail.setNext(new MyNode<>(e));
            this.tail = this.tail.getNext();
            this.size += 1;
        }
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void insert(int index, E e) throws IndexOutOfBoundsException {
        if (isInsertionAtHeadAndEmptyList(index)) {
            init(e);
        } else if (isInsertionAtTailAndPopulatedList(index)) {
            append(e);
        } else {
            validateIndex(index);

            if (index == 0) {
                updatePopulatedHead(e);
            } else {
                insertNodeAtPopulatedIndex(index, e);
            }
        }
    }

    private boolean isInsertionAtHeadAndEmptyList(int index) {
        return isEmpty() && index == 0;
    }

    private boolean isInsertionAtTailAndPopulatedList(int index) {
        return !isEmpty() && index == size;
    }

    private void updatePopulatedHead(E e) {
        MyNode<E> newNode = new MyNode<>(e);
        newNode.setNext(this.head);
        this.head = newNode;
        size += 1;
    }

    private void insertNodeAtPopulatedIndex(int index, E e) {
        MyNode<E> newNode = new MyNode<>(e);
        MyNode<E> nodePreviousToIndex = getNodeAtIndex(index - 1);
        newNode.setNext(nodePreviousToIndex.getNext());
        nodePreviousToIndex.setNext(newNode);
        size += 1;
    }

    @Override
    public E removeByIndex(int index) throws IndexOutOfBoundsException {
        return null;
    }

    private void validateIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
    }
}
