package br.com.gusto.fatec.ed.exercicios.model.controller;

import br.com.gusto.fatec.ed.exercicios.model.Node;
import br.com.gusto.fatec.ed.exercicios.model.exception.EmptyQueueException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CircularDeque {
    private static final Logger LOGGER = LoggerFactory.getLogger(CircularDeque.class.getName());

    private Node first;
    private Node last;

    public CircularDeque() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueueFront(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) first = newNode;
        else last.setNext(newNode);
        last = newNode;
        last.setNext(first);
    }

    public void enqueueRear(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) first = newNode;
        else last.setNext(newNode);
        last = newNode;
        last.setNext(first);
    }

    public Object dequeueFront() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException();
        var tmp = first.getElement();
        if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.getNext();
            last.setNext(first);
        }
        return tmp;
    }

    public Object dequeueRear() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException();
        var tmp = first.getElement();
        if (first == last) {
            first = null;
            last = null;
        } else {
            first = first.getNext();
            last.setNext(first);
        }
        return tmp;
    }

    public Object getMiddle() {
        Object middle = null;
        Node p1 = first;
        Node p2 = first;
        var rounds = 0;
        while (p2.getNext() != first) {
            rounds++;
            if (rounds % 2 == 0) {
                p1 = p1.getNext();
                middle = p1.getElement();
            }
            p2 = p2.getNext();
        }
        return middle;
    }

    public void displayQueue() {
        Node index = first;
        while (index.getNext() != first) {
            LOGGER.info(index.getElement().toString());
            index = index.getNext();
        }
        LOGGER.info(index.getElement().toString());
    }
}
