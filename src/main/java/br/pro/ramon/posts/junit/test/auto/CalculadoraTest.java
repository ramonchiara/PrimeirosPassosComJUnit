package br.pro.ramon.posts.junit.test.auto;

import br.pro.ramon.posts.junit.Calculadora;
import java.util.Scanner;

public class CalculadoraTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("n1: ");
        double n1 = Double.parseDouble(console.nextLine());
        System.out.print("n2: ");
        double n2 = Double.parseDouble(console.nextLine());

        Calculadora aut = new Calculadora(n1, n2);

        System.out.println("Soma.........: " + aut.getSoma());
        System.out.println("Subtração....: " + aut.getSubtracao());
        System.out.println("Multiplicação: " + aut.getMultiplicacao());
        System.out.println("Divisão......: " + aut.getDivisao());
    }

}
