package com.datastructures.stack.dynamic.arraybased;

import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;


class MyDynamicArrayBasedStackTest {

    @Test
    void testCreateEmptyStack() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();
        
        assertInstanceOf(MyDynamicArrayBasedStack.class, stack);
    }

    @Test
    void testIsEmptyReturnsTrueWhenStackIsEmpty() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();
        
        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmptyReturnsFalseWhenStackIsPopulated() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();
        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    void testClearEmptiesStackWhenStackIsPopulated() {
        MyDynamicArrayBasedStack<String> stack = new MyDynamicArrayBasedStack<>();
        stack.push("string1");
        stack.push("string2");
        stack.push("string3");

        stack.clear();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testClearWorksOnEmptyStack() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();
        stack.clear();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testSizeReturnsZeroWhenStackIsEmpty() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();
        
        assertEquals(0, stack.size());
    }

    @Test
    void testSizeReturnsNumberOfElementsWhenStackPopulated() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());

    }

    @Test
    void testPeekThrowsExceptionWhenStackIsEmpty() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();

        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    void testPeekReturnsTopElementWhenStackIsPopulated() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.peek());
    }

    @Test
    void testPushAddsElementToStack() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();
        stack.push(3);
        
        assertEquals(3, stack.peek());
    }

    @Test
    void testPopRemovesPeekElementFromStack() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop());
    }

    @Test
    void testPopThrowsExceptionWhenStackIsEmpty() {
        MyDynamicArrayBasedStack<Integer> stack = new MyDynamicArrayBasedStack<>();

        assertThrows(EmptyStackException.class, stack::pop);
    }
}
