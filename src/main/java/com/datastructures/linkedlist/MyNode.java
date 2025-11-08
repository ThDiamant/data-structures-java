package com.datastructures.linkedlist;

public class MyNode<E> {
    private E data;
    private MyNode<E> next;

    public MyNode(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E e) {
        this.data = e;
    }

    public MyNode<E> getNext() {
        return this.next;
    }

    public void setNext(MyNode<E> next) {
        this.next = next;
    }
}
