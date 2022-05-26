package br.com.gusto.fatec.ed.exercicios;

import br.com.gusto.fatec.ed.exercicios.controller.BinaryTree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercicio {
    public static final Logger LOGGER = LoggerFactory.getLogger(Exercicio.class.getName());

    public static void main(String[] args) {
        BinaryTree arvore = new BinaryTree();
        arvore.insert(arvore.getRoot(), 1);
        arvore.insert(arvore.getRoot(), 2);
        arvore.insert(arvore.getRoot(), 3);
        arvore.insert(arvore.getRoot(), 4);
        arvore.insert(arvore.getRoot(), 5);

        LOGGER.info(arvore.printTree(arvore.getRoot()));
        LOGGER.info(String.valueOf(arvore.treeHeight(arvore.getRoot())));
    }
}
