package com.hedima.presentacion;

import com.hedima.modelo.Campos;

import java.util.Scanner;

public class ProbarCampos {
    public static void main(String[] args) {
        //Crear el objeto

        Campos c1 = new Campos();

        c1.x = 10;
        c1.incrementa();
        c1.incrementa();
        c1.incrementa();
        c1.incrementa(10);
        System.out.println(c1.muestra());


    }
}
