package com.pruebasunitarias.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    Cuadrado c = new Cuadrado(4);

    @Test
    void area() {
        assertEquals(16, c.area());
    }

    @Test
    void perimetro() {
        assertEquals(16, c.perimetro());
    }

    @Test
    void test () {
        assertAll(
                () -> assertEquals( 16, c.area()),
                () -> assertEquals( 16, c.perimetro())
        );
    }
}