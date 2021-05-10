package br.com.gusto.fatec.ed.exercicios.ex2.model.exception;

public class EmptyQueueException extends Exception {
    @Override
    public String toString() {
        return "Empty Queue!";
    }
}
