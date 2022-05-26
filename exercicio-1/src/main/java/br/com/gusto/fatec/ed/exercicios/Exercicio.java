package br.com.gusto.fatec.ed.exercicios;

import br.com.gusto.fatec.ed.exercicios.controller.Fila;

import java.util.Random;

public class Exercicio {
    /*
     * 1 – Implemente um método que inverta a ordem dos elementos de uma fila
     * estática (representada por vetor). Dentro do método, instancie e utilize uma
     * pilha para realizar essa alteração. Utilize apenas os métodos isEmpty,
     * isFull, push e pop da pilha e os métodos isEmpty, isFull, queue, dequeue da
     * própria fila.
     *
     */
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        for (var i = 0; i < 10; i++) fila.enfilerar(1 + (new Random().nextInt() * (20 - 1)));
        fila.inverteFila();
    }
}
