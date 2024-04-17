package com.pruebasunitarias.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    @Test
    void test(){
        Rectangulo r = new Rectangulo( 3, 4);
        assertAll(
                () -> assertEquals(14, r.perimetro()),
                () -> assertEquals(12, r.area())
        );
    }

}