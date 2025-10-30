# Stack

The Stack is a linear data structure that follows the LIFO (Last In First Out) principle. This means that both insertion
and deletion operations happen at one end only: new elements are pushed on the top of the stack, and elements are
removed from the top of the stack.

There are two types of stacks:
* **Fixed Size Stack:** has a predefined capacity.
* **Dynamic Size Stack:** can grow and shrink automatically as needed.

It can be implemented using an array by treating the end of the array as the top of the stack.

## Basic Operations

* `push()` to insert an element into the stack.
  * Fixed size stack: pushing an element into a full stack will cause an *overflow* condition. 
* `top()` to return the top element of the stack.
* `pop()` to remove an element from the stack
  * Popping an element from an empty stack will cause an underflow condition.
* `isEmpty()` returns true if the stack is empty else false.
* `size()` returns the size of the stack.

## Time and Space Complexity

* Time complexity: All operations on the stack are $O(1)$
* Space complexity:
  * Stack: $O(N)$
  * Stack operations: $O(1)$


## Implementations

Stacks can be implemented in various ways:
1) Using `Array`
2) Using `LinkedList`
3) Using `Dequeue`



