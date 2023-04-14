package com.hedima.modelo;

public class Coche {

    //1.Atributos
    public String marca;
    public int numPlazas;
    public boolean electrico;
    public double precio;
    //2. Métodos

    public String acelerar(){
        return "El coche está acelerando ...";
    }

    public String frenar(){
        return "El coche está frenando...";
    }

    public String marchaAtras(float metros){
        return "El  coche está haciendo marcha atras en " + metros ;
    }
    //3. Constructores
    //4. Setters y Gette

}
