package br.pro.ramon.posts.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    private static final double DELTA = 0.000001;

    @Test
    public void testSomaDeveRetornar0QuandoPassamosZeroEZero() {
        double n1 = 0;
        double n2 = 0;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSoma();
        double valorEsperado = 0;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSomaDeveRetornar10QuandoPassamosDezEZero() {
        double n1 = 10;
        double n2 = 0;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSoma();
        double valorEsperado = 10;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSomaDeveRetornar10QuandoPassamosZeroEDez() {
        double n1 = 0;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSoma();
        double valorEsperado = 10;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSomaDeveRetornar20QuandoPassamosDezEDez() {
        double n1 = 10;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSoma();
        double valorEsperado = 20;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSomaDeveRetornar15QuandoPassamosDezECinco() {
        double n1 = 10;
        double n2 = 5;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSoma();
        double valorEsperado = 15;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSomaDeveRetornar15QuandoPassamosCincoEDez() {
        double n1 = 5;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSoma();
        double valorEsperado = 15;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSubtracaoDeveRetornar0QuandoPassamosZeroEZero() {
        double n1 = 0;
        double n2 = 0;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSubtracao();
        double valorEsperado = 0;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSubtracaoDeveRetornar10QuandoPassamosDezEZero() {
        double n1 = 10;
        double n2 = 0;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSubtracao();
        double valorEsperado = 10;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSubtracaoDeveRetornarMenos10QuandoPassamosZeroEDez() {
        double n1 = 0;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSubtracao();
        double valorEsperado = -10;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSubtracaoDeveRetornar0QuandoPassamosDezEDez() {
        double n1 = 10;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSubtracao();
        double valorEsperado = 0;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSubtracaoDeveRetornar5QuandoPassamosDezECinco() {
        double n1 = 10;
        double n2 = 5;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSubtracao();
        double valorEsperado = 5;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testSubtracaoDeveRetornarMenos5QuandoPassamosCincoEDez() {
        double n1 = 5;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getSubtracao();
        double valorEsperado = -5;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testMultiplicacaoDeveRetornar0QuandoPassamosZeroEZero() {
        double n1 = 0;
        double n2 = 0;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getMultiplicacao();
        double valorEsperado = 0;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testMultiplicacaoDeveRetornar0QuandoPassamosDezEZero() {
        double n1 = 10;
        double n2 = 0;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getMultiplicacao();
        double valorEsperado = 0;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testMultiplicacaoDeveRetornar0QuandoPassamosZeroEDez() {
        double n1 = 0;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getMultiplicacao();
        double valorEsperado = 0;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testMultiplicacaoDeveRetornar100QuandoPassamosDezEDez() {
        double n1 = 10;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getMultiplicacao();
        double valorEsperado = 100;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testMultiplicacaoDeveRetornar50QuandoPassamosDezECinco() {
        double n1 = 10;
        double n2 = 5;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getMultiplicacao();
        double valorEsperado = 50;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testMultiplicacaoDeveRetornar50QuandoPassamosCincoEDez() {
        double n1 = 5;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getMultiplicacao();
        double valorEsperado = 50;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoDeveRetornarNaNQuandoPassamosZeroEZero() {
        double n1 = 0;
        double n2 = 0;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getDivisao();
        double valorEsperado = Double.NaN;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoDeveRetornarInfinityQuandoPassamosDezEZero() {
        double n1 = 10;
        double n2 = 0;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getDivisao();
        double valorEsperado = Double.POSITIVE_INFINITY;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testDivisaoDeveRetornar0QuandoPassamosZeroEDez() {
        double n1 = 0;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getDivisao();
        double valorEsperado = 0;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testDivisaoDeveRetornar1QuandoPassamosDezEDez() {
        double n1 = 10;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getDivisao();
        double valorEsperado = 1;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testDivisaoDeveRetornar2QuandoPassamosDezECinco() {
        double n1 = 10;
        double n2 = 5;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getDivisao();
        double valorEsperado = 2;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }

    @Test
    public void testDivisaoDeveRetornarMeioQuandoPassamosCincoEDez() {
        double n1 = 5;
        double n2 = 10;

        Calculadora aut = new Calculadora(n1, n2);

        double valorObtido = aut.getDivisao();
        double valorEsperado = 0.5;

        assertEquals(valorEsperado, valorObtido, DELTA);
    }
}
