package br.com.gusto.fatec.ed.exercicios;

import br.com.gusto.fatec.ed.exercicios.model.controller.CircularDeque;
import br.com.gusto.fatec.ed.exercicios.model.exception.EmptyQueueException;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercicio {
	private static final Logger LOGGER = LoggerFactory.getLogger(Exercicio.class.getName());

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
