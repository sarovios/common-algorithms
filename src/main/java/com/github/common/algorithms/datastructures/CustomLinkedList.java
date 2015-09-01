package com.github.common.algorithms.datastructures;

import java.util.NoSuchElementException;

/**
 * A LinkedList is an ordered set of data elements, each containing a link to its successor (singly),
 * and sometimes its predecessor (doubly)
 * Time complexity:
 * - Access: O(n)
 * - Search: O(n)
 * - Insertion: O(n)
 * - Deletion: O(n)
 */
public class CustomLinkedList<AnyType> {

    private Node<AnyType> head;

    /**
     * Constructs an empty linked list
     */
    public CustomLinkedList() {

    }

    public void addFirst(AnyType item) {
        head = new Node<AnyType>(item, head);
    }

    public AnyType getFirst() {
        if (head == null) throw new NoSuchElementException();
        return head.data;
    }

    public void addLast(AnyType item) {
        if (head == null) addFirst(item);
        else {
            Node<AnyType> tmp = head;
            while (tmp.next != null) tmp = tmp.next;
            tmp.next = new Node<AnyType>(item, null);
        }
    }

    public AnyType getLast() {
        if (head == null) throw new NoSuchElementException();
        Node<AnyType> tmp = head;
        while (tmp.next != null) tmp = tmp.next;
        return tmp.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }

    public void insertAfter(AnyType key, AnyType toInsert) {
        Node<AnyType> tmp = head;
        while ( (tmp != null) && (tmp.data != key) ) tmp = tmp.next;
        Node<AnyType> newNode = new Node<AnyType>(toInsert, tmp.next);
        tmp.next = newNode;
    }

    public void insertBefore(AnyType key, AnyType toInsert) {
        if (head.data == key) {
            addFirst(toInsert);
            return;
        }

        Node<AnyType> curr = head;
        Node<AnyType> previous = null;
        while ( (curr != null) && (curr.data != key)) {
            previous = curr;
            curr = curr.next;
        }
        Node<AnyType> newNode = new Node<AnyType>(toInsert, curr);
        previous.next = newNode;
    }









    public AnyType removeFirst() {
        AnyType first = getFirst();
        head = head.next;
        return first;
    }





    public boolean contains(AnyType x) {
        Node<AnyType> tmp = head;
        while (tmp.next != null) {
            if (tmp.data == x) return true;
            tmp = tmp.next;
        }
        return false;
    }

    @Override
    public String toString() {
        if (head == null) return "[ ]";
        StringBuffer sb = new StringBuffer();
        Node<AnyType> tmp = head;
        sb.append("[ ");
        while (tmp.next != null) {
            sb.append(tmp.data);
            sb.append(" ");
            tmp = tmp.next;
        }
        sb.append(tmp.data);
        sb.append(" ]");
        return sb.toString();
    }

    private static class Node<AnyType> {

        private AnyType data;
        private Node<AnyType> next;

        public Node(AnyType data, Node<AnyType> next) {
            this.data = data;
            this.next = next;
        }
    }
}
