package com.hedima.presentacion;

import com.hedima.modelo.Coche;

public class Main {
    public static void main(String[] args) {

       Coche renault = new Coche();
       renault.marca = "Renault";
        renault.numPlazas = 2;
       renault.electrico = true;
       renault.precio = 35_000.50;

        System.out.println("Marca ->" + renault.marca);
        System.out.println("numPlaza ->" + renault.numPlazas);
        System.out.println("electrico ->" + renault.electrico);
        System.out.println("Precio ->" + renault.precio);

        System.out.println(renault.frenar());
        System.out.println(renault.marchaAtras(200));


        Coche toyota = new Coche();
        toyota.marca = "Toyota";
        toyota.numPlazas = 5;
        toyota.electrico = false;
        toyota.precio = 55_000.50;

        System.out.println("Marca " + toyota.marca);
        System.out.println("numPlaza ->" + toyota.numPlazas);
        System.out.println("electrico ->" + toyota.electrico);
        System.out.println("Precio ->" + toyota.precio);




    }
}