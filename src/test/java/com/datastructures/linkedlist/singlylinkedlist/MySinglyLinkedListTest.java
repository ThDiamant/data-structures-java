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
    void testAppendNullElement() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append(null);

        assertEquals(1, list.size());
        assertNull(list.get(0));
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
    void testInsertThrowsExceptionWhenIndexIsNegative() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.insert(-1, "1"));
    }

    @Test
    void testInsertThrowsExceptionWhenIndexIsLargerThanList() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        assertThrows(IndexOutOfBoundsException.class, () -> list.insert(5, "5"));
    }

    @Test
    void testInsertAtHeadWhenListIsEmpty() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.insert(0, "1");

        assertEquals(1, list.size());
        assertEquals("1", list.get(0));
    }

    @Test
    void testInsertAtHeadWhenListIsPopulated() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        list.insert(0, "5");

        assertEquals(5, list.size());
        assertEquals("5", list.get(0));
        assertEquals("1", list.get(1));
        assertEquals("2", list.get(2));
        assertEquals("3", list.get(3));
        assertEquals("4", list.get(4));
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

        list.insert(2, "5");

        assertEquals(5, list.size());
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("5", list.get(2));
        assertEquals("3", list.get(3));
        assertEquals("4", list.get(4));
    }

    @Test
    void testInsertNullElement() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        list.insert(2, null);

        assertEquals(5, list.size());
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertNull(list.get(2));
        assertEquals("3", list.get(3));
        assertEquals("4", list.get(4));
    }

    @Test
    void testRemoveByIndexThrowsExceptionWhenIndexIsNegative() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");

        assertThrows(IndexOutOfBoundsException.class, () -> list.removeByIndex(-1));
    }

    @Test
    void testRemoveByIndexThrowsExceptionWhenListIsEmpty() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.removeByIndex(0));
    }

    @Test
    void testRemoveByIndexThrowsExceptionWhenIndexLargerThanList() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");

        assertThrows(IndexOutOfBoundsException.class, () -> list.removeByIndex(5));
    }

    @Test
    void testRemoveByIndexWithSingleElement() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");

        String removedElement = list.removeByIndex(0);

        assertEquals("1", removedElement);
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    void testRemoveByIndexWhenListIsPopulated() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");
        list.append("5");

        String removedElement = list.removeByIndex(2);

        assertEquals("3", removedElement);
        assertEquals(4, list.size());
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("4", list.get(2));
        assertEquals("5", list.get(3));
    }

    @Test
    void testRemoveByIndexRemovesTailWhenListIsPopulated() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");
        list.append("5");

        String removedElement = list.removeByIndex(4);

        assertEquals("5", removedElement);
        assertEquals(4, list.size());
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));
        assertEquals("4", list.get(3));
    }

    @Test
    void testRemoveByIndexRemovesHeadWhenListIsPopulated() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");
        list.append("5");

        String removedElement = list.removeByIndex(0);

        assertEquals("1", removedElement);
        assertEquals(4, list.size());
        assertEquals("2", list.get(0));
        assertEquals("3", list.get(1));
        assertEquals("4", list.get(2));
        assertEquals("5", list.get(3));
    }

    @Test
    void testMultipleInsertsAndRemovals() {
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");
        String removedElement = list.removeByIndex(2);
        list.insert(1, "6");
        list.append("5");

        assertEquals(5, list.size());
        assertEquals("3", removedElement);
        assertEquals("1", list.get(0));
        assertEquals("6", list.get(1));
        assertEquals("2", list.get(2));
        assertEquals("4", list.get(3));
    }
}
