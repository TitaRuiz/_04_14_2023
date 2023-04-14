package com.hedima.presentacion;

import com.hedima.modelo.Saludo;

public class ProbarSaludo {

    public static void main(String[] args) {
        Saludo s1 = new Saludo();
       s1.saludo = "Buenas tardes";
        System.out.println(s1.saludar());

    }
}
