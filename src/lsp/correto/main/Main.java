package lsp.correto.main;

import lsp.correto.formas.Forma;
import lsp.correto.formas.Quadrado;
import lsp.correto.formas.Retangulo;

public class Main {
    public static void main(String[] args) {
        int altura = 3;
        int largura = 8;
        int lado = 7;

        Forma retangulo = new Retangulo(altura, largura);
        Forma quadrado = new Quadrado(lado);

        System.out.println("A área do quadrado é: " + quadrado.getArea());
        System.out.println("A área do retangulo é: " + retangulo.getArea());


    }
}
