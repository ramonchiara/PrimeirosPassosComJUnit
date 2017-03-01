package br.pro.ramon.posts.junit;

public class Calculadora {

    private double n1, n2;

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getSoma() {
        return n1 + n2;
    }

    public double getSubtracao() {
        return n1 - n2;
    }

    public double getMultiplicacao() {
        return n1 * n2;
    }

    public double getDivisao() {
        if (n2 == 0) {
            throw new ArithmeticException();
        }
        return n1 / n2;
    }

}
