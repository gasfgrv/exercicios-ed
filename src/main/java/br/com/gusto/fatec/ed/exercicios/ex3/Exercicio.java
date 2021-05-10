package br.com.gusto.fatec.ed.exercicios.ex3;

import br.com.gusto.fatec.ed.exercicios.ex3.model.controller.CircularDeque;
import br.com.gusto.fatec.ed.exercicios.ex3.model.exception.EmptyQueueException;

import java.util.Random;
import java.util.logging.Logger;

public class Exercicio {
	private static final Logger LOGGER = Logger.getLogger(Exercicio.class.getName());

	public static void main(String[] args) throws EmptyQueueException {
		CircularDeque deque = new CircularDeque();
		deque.enqueueFront(14);
		deque.enqueueFront(22);
		deque.enqueueFront(6);
		LOGGER.info(deque.dequeueRear().toString());
		deque.displayQueue();
		LOGGER.info(deque.dequeueFront().toString());
		LOGGER.info(deque.dequeueFront().toString());
		deque.displayQueue();
		deque.enqueueFront(9);
		deque.enqueueFront(20);
		deque.displayQueue();
		deque.enqueueRear(new Random().nextInt());
		deque.enqueueRear(new Random().nextInt());
		deque.enqueueRear(new Random().nextInt());
		LOGGER.info(deque.getMiddle().toString());
	}
}
