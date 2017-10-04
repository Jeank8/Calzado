package com.example.android.calzado;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void combinacion1() throws Exception{
        int cantidad = 1;
        boolean masculino = true;
        boolean femenino = false;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean adidas = false;
        boolean nike = true;
        boolean puma = false;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 120000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion2() throws Exception{
        int cantidad = 1;
        boolean masculino = true;
        boolean femenino = false;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean adidas = true;
        boolean nike = false;
        boolean puma = false;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 140000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion3() throws Exception{
        int cantidad = 1;
        boolean masculino = true;
        boolean femenino = false;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean adidas = false;
        boolean nike = false;
        boolean puma = true;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 130000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion4() throws Exception{
        int cantidad = 1;
        boolean masculino = true;
        boolean femenino = false;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean adidas = false;
        boolean nike = true;
        boolean puma = false;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 50000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion5() throws Exception{
        int cantidad = 1;
        boolean masculino = true;
        boolean femenino = false;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean adidas = true;
        boolean nike = false;
        boolean puma = false;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 80000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion6() throws Exception{
        int cantidad = 1;
        boolean masculino = true;
        boolean femenino = false;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean adidas = false;
        boolean nike = false;
        boolean puma = true;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 100000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion7() throws Exception{
        int cantidad = 1;
        boolean masculino = false;
        boolean femenino = true;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean adidas = false;
        boolean nike = true;
        boolean puma = false;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 100000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion8() throws Exception{
        int cantidad = 1;
        boolean masculino = false;
        boolean femenino = true;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean adidas = true;
        boolean nike = false;
        boolean puma = false;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 130000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion9() throws Exception{
        int cantidad = 1;
        boolean masculino = false;
        boolean femenino = true;
        boolean zapatilla = true;
        boolean clasico = false;
        boolean adidas = false;
        boolean nike = false;
        boolean puma = true;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 110000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion10() throws Exception{
        int cantidad = 1;
        boolean masculino = false;
        boolean femenino = true;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean adidas = false;
        boolean nike = true;
        boolean puma = false;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 60000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion11() throws Exception{
        int cantidad = 1;
        boolean masculino = false;
        boolean femenino = true;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean adidas = true;
        boolean nike = false;
        boolean puma = false;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 70000;
        assertEquals(valorEsperado,valorReal,0);
    }

    @Test
    public void combinacion12() throws Exception{
        int cantidad = 1;
        boolean masculino = false;
        boolean femenino = true;
        boolean zapatilla = false;
        boolean clasico = true;
        boolean adidas = false;
        boolean nike = false;
        boolean puma = true;

        int valorEsperado = Metodos.total(cantidad,masculino,femenino,zapatilla,clasico,adidas,nike,puma);
        int valorReal = 120000;
        assertEquals(valorEsperado,valorReal,0);
    }
}