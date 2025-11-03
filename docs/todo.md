# TODO

## Stacks

- [X] Make the existing `MyStack` interface follow: https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html#push-E-
  - Why do the `push` and `pop` operations return the element they work with?
    - `push`: Simply for convenience, but since it doesn't really make sense to me, I am going to keep this one as `void`.
    - `pop`: It is important because it's the way we "take"/"remove" elements from the queue.
  - Add and understand the `search` method.
    - Apparently, this is something that Java adds and is not technically part of the basic stack operations. For that
      reason I am going to ignore it.
- [ ] Implement a fixed-size array-based stack.
- [ ] Implement a dynamic array-based stack using a finite array. If a new element is added beyond the initial array,
      create a new array to hold the new elements. **Investigate** that this is how `ArrayList` is implemented, and if
      not, see how it is implemented and do it yourself.
- [ ] Implement linked list based stacks.
- [ ] Implement dequeue based stacks (implement the given java interface even).

## Linked Lists

- [ ] Implement all the methods of a singly linked list.
- [ ] Implement a doubly linked list.
- [ ] Implement a circular linked list.
