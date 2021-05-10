package br.com.gusto.fatec.ed.exercicios.ex2.model.controller;

import br.com.gusto.fatec.ed.exercicios.ex2.model.exception.EmptyQueueException;

import java.util.logging.Logger;

public class Fatorar {

    private static final Logger LOGGER = Logger.getLogger(Fatorar.class.getName());

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
