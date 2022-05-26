package br.com.gusto.fatec.ed.exercicios.controller;

public class Fila {
    private final Object[] objects;
    private int primeiro;
    private int ultimo;

    public Fila(int tamanho) {
        objects = new Object[tamanho];
        primeiro = -1;
        ultimo = -1;
    }

    public boolean isVazio() {
        return ultimo == -1;
    }

    public boolean isCheio() {
        return objects.length == ultimo + 1;
    }

    public void enfilerar(Object item) {
        if (isVazio()) {
            primeiro = 0;
            ultimo = 0;
            objects[ultimo] = item;
        } else if (!isCheio()) objects[++ultimo] = item;
    }

    public Object desenfilerar() {
        if (isVazio()) return null;
        if (objects.length == 1) {
            ultimo--;
            return objects[primeiro--];
        }
        Object temp = objects[primeiro];
        if (ultimo - primeiro >= 0) System.arraycopy(objects, primeiro + 1, objects, primeiro, ultimo - primeiro);
        ultimo--;
        return temp;
    }

    public void inverteFila() {
        Pilha pilha = new Pilha(objects.length);
        for (var i = 0; i < objects.length; i++) pilha.empilhar(desenfilerar());
        for (var i = 0; i < objects.length; i++) enfilerar(pilha.desempilhar());
    }
}
