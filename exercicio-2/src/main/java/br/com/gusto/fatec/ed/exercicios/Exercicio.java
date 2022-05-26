package br.com.gusto.fatec.ed.exercicios;

import br.com.gusto.fatec.ed.exercicios.model.controller.Fatorar;
import br.com.gusto.fatec.ed.exercicios.model.exception.EmptyQueueException;

public class Exercicio {
    public static void main(String[] args) throws EmptyQueueException {
        new Fatorar(3960);
    }
}
