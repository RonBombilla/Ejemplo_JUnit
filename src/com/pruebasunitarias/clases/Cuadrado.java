package com.pruebasunitarias.clases;

import com.pruebasunitarias.services.CalculosCuadrado;

public class Cuadrado implements CalculosCuadrado {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro(){
        return lado * 2 + lado * 2;
    }

    @Override
    public double area(){
        return lado * lado;
    }
}
