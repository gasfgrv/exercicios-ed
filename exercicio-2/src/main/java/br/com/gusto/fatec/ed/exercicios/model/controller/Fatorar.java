package br.com.gusto.fatec.ed.exercicios.model.controller;

import br.com.gusto.fatec.ed.exercicios.model.exception.EmptyQueueException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fatorar {

    private static final Logger LOGGER = LoggerFactory.getLogger(Fatorar.class.getName());

    public Fatorar(int num) throws EmptyQueueException {
        int result = num;
        DinamicQueue fatores = new DinamicQueue();

        for (var i = 2; i <= num; i++)
            while (num % i == 0) {
                num = num / i;
                fatores.enqueue(i);
            }

        LOGGER.info(fatores.print() + result);
    }
}
