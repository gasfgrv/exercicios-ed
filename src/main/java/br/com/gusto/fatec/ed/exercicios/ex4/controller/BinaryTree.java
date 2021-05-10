package br.com.gusto.fatec.ed.exercicios.ex4.controller;

import br.com.gusto.fatec.ed.exercicios.ex4.model.Node;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public BinaryTree() {
        root = null;
    }

    public void insert(Node path, int value) {
        if (path == null) {
            root = new Node(value, null, null);
        } else if (value <= path.getElement()) {
            if (path.getLeft() == null) path.setLeft(new Node(value, null, null));
            else insert(path.getLeft(), value);
        } else if (value > path.getElement()) {
            if (path.getRight() != null) insert(path.getRight(), value);
            else path.setRight(new Node(value, null, null));
        }
    }

    public String printTree(Node path) {
        String msg;
        msg = "(";
        if (path != null) {
            msg += " " + path.getElement() + " ";
            msg += printTree(path.getLeft());
            msg += printTree(path.getRight());
        }
        msg += ") ";
        return msg;
    }

    public int treeHeight(Node root) {
        if (root == null) return 0;
        return (1 + Math.max(treeHeight(root.getLeft()), treeHeight(root.getRight())));
    }
}
