package org.jtj.abstractclass;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node("Apple");
        Node node2 = new Node("Banana");
        Node node3 = new Node("Orange");

        MyLinkedList linkedList = new MyLinkedList(node1);
        linkedList.addItem(node2);
        linkedList.addItem(node3);

        System.out.println("Linked List:");
        linkedList.traverse(linkedList.getRoot());

        System.out.println("\nRemoving 'Banana' from the list:");
        linkedList.removeItem(node2);

        System.out.println("\nLinked List after removal:");
        linkedList.traverse(linkedList.getRoot());
    }
}
