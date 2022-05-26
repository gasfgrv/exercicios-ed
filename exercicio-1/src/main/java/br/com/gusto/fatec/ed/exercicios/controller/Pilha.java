package br.com.gusto.fatec.ed.exercicios.controller;

public class Pilha {
    private final Object[] objects;
    private int topo;

    public Pilha(int tamanho) {
        objects = new Object[tamanho];
        topo = -1;
    }

    public boolean isVazio() {
        return topo == -1;
    }

    public boolean isCheio() {
        return topo == objects.length - 1;
    }

    public void empilhar(Object item) {
        if (!isCheio()) {
            objects[++topo] = item;
        }
    }

    public Object desempilhar() {
        if (isVazio()) {
            return null;
        }
        return objects[topo--];
    }
}
