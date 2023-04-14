package com.hedima.modelo;

public class Campos {
    //1.Atributos de campos
    public int x;
    //2.Metodos
    public String muestra(){
        return "El valor de x =" +  x;
    }
    //Sobrecarga
    public void incrementa(){
        x++;
    }

    public void incrementa(int num){
        x+=num;
    }

}
