package br.com.gusto.fatec.ed.exercicios.ex2;

import br.com.gusto.fatec.ed.exercicios.ex2.model.controller.Fatorar;
import br.com.gusto.fatec.ed.exercicios.ex2.model.exception.EmptyQueueException;

public class Exercicio {
    public static void main(String[] args) throws EmptyQueueException {
        new Fatorar(3960);
    }
}
