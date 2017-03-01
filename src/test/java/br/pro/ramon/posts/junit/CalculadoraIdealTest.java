package br.pro.ramon.posts.junit;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CalculadoraIdealTest {

    private static final double DELTA = 0.000001;

    private CalculadoraIdeal aut;

    @Before
    public void setUp() {
        aut = new CalculadoraIdeal();
    }

    @Test
    public void testSomaDeveRetornarZeroQuandoPassamosZeroEZero() {
        assertEquals(0, aut.getSoma(0, 0), DELTA);
    }

    public void testSomaDeveRetornar10QuandoPassamosDezEZero() {
        assertEquals(10, aut.getSoma(0, 10), DELTA);
    }

    @Test
    public void testSomaDeveRetornar10QuandoPassamosZeroEDez() {
        assertEquals(10, aut.getSoma(10, 0), DELTA);
    }

    @Test
    public void testSomaDeveRetornar20QuandoPassamosDezEDez() {
        assertEquals(20, aut.getSoma(10, 10), DELTA);
    }

    @Test
    public void testSomaDeveRetornar15QuandoPassamosDezECinco() {
        assertEquals(15, aut.getSoma(10, 5), DELTA);
    }

    @Test
    public void testSomaDeveRetornar15QuandoPassamosCincoEDez() {
        assertEquals(15, aut.getSoma(5, 10), DELTA);
    }

}
