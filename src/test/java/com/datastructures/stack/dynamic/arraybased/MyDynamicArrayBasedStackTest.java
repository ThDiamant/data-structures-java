package com.datastructures.stack.dynamic.arraybased;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * 1) Create a stack.
 * 2) Push an element into the stack. Should work with many elements, no restrictions.
 * 3) Return the top element of the stack. If stack is empty throw exception.
 * 4) Remove an element from the stack. If stack is empty what should be done?
 * 5) Check if the stack is empty.
 * 6) Check that size() returns the correct size of the stack.
 *   * Does this mean number of elements?
 *   * What should be returned if the stack is empty?
 */
class MyDynamicArrayBasedStackTest {
    @Test
    void testCreateStack() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();
        
        assertInstanceOf(MyDynamicArrayBasedStack.class, stack);
    }

    @Test
    void testIsEmptyReturnsTrueWhenStackIsEmpty() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();
        
        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmptyReturnsFalseWhenStackIsPopulated() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();
        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    void testSizeReturnsZeroWhenStackIsEmpty() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();
        
        assertEquals(0, stack.size());
    }

    @Test
    void testSizeReturnsNumberOfElementsWhenStackPopulated() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());

    }

    @Test
    void testTopReturnsNullWhenStackIsEmpty() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();

        assertThrows(NoSuchElementException.class, stack::top);
    }

    @Test
    void testTopReturnsTopElementWhenStackIsPopulated() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.top());
    }

    @Test
    void testPushAddsElementToStack() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();
        stack.push(3);
        
        assertEquals(3, stack.top());
    }

    @Test
    void testPopRemovesTopElementFromStack() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();
        stack.push(1);
        stack.push(2);
        stack.pop();

        assertEquals(1, stack.top());
    }

    @Test
    void testPopThrowsExceptionWhenStackIsEmpty() {
        MyDynamicArrayBasedStack stack = new MyDynamicArrayBasedStack();

        assertThrows(NoSuchElementException.class, stack::pop);
    }
}
