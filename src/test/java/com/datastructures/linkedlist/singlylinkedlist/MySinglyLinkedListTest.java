package com.datastructures.linkedlist.singlylinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySinglyLinkedListTest {

    @Test
    void testCreateEmptyLinkedList() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        assertInstanceOf(MySinglyLinkedList.class, list);
    }

    @Test
    void testCreateLinkedListWithNode() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>("1");

        assertInstanceOf(MySinglyLinkedList.class, list);
    }

    @Test
    void testIsEmptyReturnsTrueWhenListIsEmpty() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        assertTrue(list.isEmpty());
    }

    @Test
    void testIsEmptyReturnsFalseWhenListIsPopulated() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>("1");

        assertFalse(list.isEmpty());
    }

    @Test
    void testSizeReturnsZeroWhenListIsEmpty() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        assertEquals(0, list.size());
    }

    @Test
    void testSizeReturnsNumberOfNodesWhenListIsPopulated() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>("1");

        assertEquals(1, list.size());
    }

    @Test
    void testAppendSingleElement() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");

        assertEquals(1, list.size());
    }

    @Test
    void testAppendMultipleElements() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        assertEquals(4, list.size());
    }

    @Test
    void testGetThrowsExceptionWhenListIsEmpty() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    void testGetThrowsExceptionWhenIndexIsNegative() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    void testGetThrowsExceptionWhenIndexIsLargerThanList() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(4));
    }

    @Test
    void testGetReturnsHead() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");

        assertEquals("1", list.get(0));
    }

    @Test
    void testGetReturnsCorrectElement() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        assertEquals("3", list.get(2));
    }

    @Test
    void testGetReturnsTail() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        assertEquals("4", list.get(3));
    }

    @Test
    void testClear() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        list.clear();

        assertEquals(0, list.size());
    }

    @Test
    void testInsertAtHeadWhenListIsEmpty() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.insert(0, "1");

        assertEquals(1, list.size());
        assertEquals("1", list.get(0));
    }

    @Test
    void testInsertAtTailWhenListIsPopulated() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        list.insert(4, "5");

        assertEquals(5, list.size());
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));
        assertEquals("4", list.get(3));
        assertEquals("5", list.get(4));
    }

    @Test
    void testInsertInTheMiddleWhenListIsPopulated() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        list.insert(1, "5");

        assertEquals(5, list.size());
        assertEquals("1", list.get(0));
        assertEquals("5", list.get(1));
        assertEquals("2", list.get(2));
        assertEquals("3", list.get(3));
        assertEquals("4", list.get(4));
    }
}
