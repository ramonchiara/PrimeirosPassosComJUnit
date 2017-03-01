package br.pro.ramon.posts.junit.test.manual;

import br.pro.ramon.posts.junit.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        double[][] fixture = new double[][]{
            {0, 0, 0, 0, 0, Double.NaN},
            {10, 0, 10, 10, 0, Double.POSITIVE_INFINITY},
            {0, 10, 10, -10, 0, 0},
            {10, 10, 20, 0, 100, 1},
            {10, 5, 15, 5, 50, 2},
            {5, 10, 15, -5, 50, 0.5}
        };

        for (int i = 0; i < fixture.length; i++) {
            double n1 = fixture[i][0];
            double n2 = fixture[i][1];

            System.out.printf("Testando com os números n1 = %f e n2 = %f%n", n1, n2);

            Calculadora aut = new Calculadora(n1, n2);

            double somaObtida = aut.getSoma();
            double somaEsperada = fixture[i][2];
            if (somaObtida == somaEsperada) {
                System.out.printf("Soma OK%n");
            } else {
                System.out.printf("Soma ERRADA! Esperava %f, mas obtive %f%n", somaEsperada, somaObtida);
            }

            double subtracaoObtida = aut.getSubtracao();
            double subtracaoEsperada = fixture[i][3];
            if (subtracaoObtida == subtracaoEsperada) {
                System.out.printf("Subtração OK%n");
            } else {
                System.out.printf("Subtração ERRADA! Esperava %f, mas obtive %f%n", subtracaoEsperada, subtracaoObtida);
            }

            double multiplicacaoObtida = aut.getMultiplicacao();
            double multiplicacaoEsperada = fixture[i][4];
            if (multiplicacaoObtida == multiplicacaoEsperada) {
                System.out.printf("Multiplicação OK%n");
            } else {
                System.out.printf("Multiplicação ERRADA! Esperava %f, mas obtive %f%n", multiplicacaoEsperada, multiplicacaoObtida);
            }

            double divisaoObtida = aut.getDivisao();
            double divisaoEsperada = fixture[i][5];

            if (Double.isNaN(divisaoEsperada)) {
                if (Double.isNaN(divisaoObtida)) {
                    System.out.printf("Divisão OK%n");
                } else {
                    System.out.printf("Divisão ERRADA! Esperava %f, mas obtive %f%n", divisaoEsperada, divisaoObtida);
                }
            } else if (divisaoObtida == divisaoEsperada) {
                System.out.printf("Divisão OK%n");
            } else {
                System.out.printf("Divisão ERRADA! Esperava %f, mas obtive %f%n", divisaoEsperada, divisaoObtida);
            }
        }
    }
}
