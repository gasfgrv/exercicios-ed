package br.com.gusto.fatec.ed.exercicios.model.exception;

public class EmptyQueueException extends Exception {
    @Override
    public String toString() {
        return "Empty Queue!";
    }
}
