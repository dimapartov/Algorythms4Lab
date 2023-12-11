package max_heap_bst_11;

import max_heap_linked_list.AbstractHeap;

public class MaxHeapBST<E extends Comparable<E>> implements AbstractHeap<E> {

    // Inner Node class representing a node in the binary search tree
    private class Node {
        E data;
        Node left, right;

        Node(E data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public MaxHeapBST() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        root = insert(root, element);
        size++;
    }
    // Helper method to insert a new node into the BST
    private Node insert(Node node, E element) {
        if (node == null) {
            return new Node(element);
        }

        // Insert in the left or right subtree based on comparison
        if (element.compareTo(node.data) > 0) {
            node.right = insert(node.right, element);
        } else {
            node.left = insert(node.left, element);
        }

        return node;
    }

    @Override
    public E peek() {
        if (root == null) {
            return null;
        }
        return findMax(root).data;
    }
    // Helper method to find the maximum element in the BST
    private Node findMax(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }
}