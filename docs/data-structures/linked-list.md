# Linked List

A linked list is a fundamental data structure. It mainly allows efficient insertion and deletion operations compared to
arrays. Like arrays, it is also used to implement other data structures, like stack, queue and dequeue.

There are various types of linked lists:
* Singly Linked List
* Doubly Linked List
* Circular Linked List

## Operations

* Length of Linked List
* Print Linked List
* Search in a Linked List
* Linked List Insertion
* Deleting a given key
* Deleting at given position
* Delete a Linked List
* Nth Node from Start
* Nth Node from End
* Size of Doubly Linked List

## Comparison to array

Here's how a linked list compares to an array:

* Linked List:
  * Data Structure: Non-contiguous
    * This means that each element (node) can be anywhere in memory. Different nodes are connected via pointers.
  * Memory Allocation: Allocated one by one to individual elements
  * Insertion/Deletion: Efficient
  * Access: Sequential
    * In order to reach the n-th element, we have to start from the start (first node) of the linked list, and follow n
      pointers to get to the element we want. That's because
  * Better when we need frequent insertions/deletions and don't know the final needed size.

* Array:
  * Data Structure: Contiguous
    * This means that elements are stored in contiguous memory locations.
  * Memory Allocation: Allocated to the whole array
  * Insertion/Deletion: Inefficient
    * That's because in order to insert/delete an element in the middle of the array, requires shifting all subsequent
      elements in order to maintain the contiguous structure.
  * Access: Random
    * We can instantly jump to any element we want using its index because the memory is contiguous and the position
      can be calculated mathematically.
  * Better when we want fast lookups and know the size ahead of time.
I
## Singly Linked List

A *singly linked* list is a fundamental data structure. It consists of **nodes**, where each node contains a data field
and a reference to the next node in the linked list. The next of the last node is `null`, indicating the end of the
list.
