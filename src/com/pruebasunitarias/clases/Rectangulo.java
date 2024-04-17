package com.pruebasunitarias.clases;

import com.pruebasunitarias.services.CalculosRectangulo;

public class Rectangulo implements CalculosRectangulo {

    private int alto;
    private int ancho;

    public Rectangulo() {
    }

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public int perimetro(){
        return 2 * alto + 2* ancho;
    }

    @Override
    public int area(){
        return alto * ancho;
    }
}
