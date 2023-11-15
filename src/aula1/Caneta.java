package aula1;

import javax.swing.*;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    public Caneta(String modelo, String cor, double ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    void status(){
        System.out.println("Modelo "+this.modelo);
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Carga "+this.carga);
        System.out.println("Está tampada? "+this.tampada);
    }

    void rabiscar (){
        if (this.tampada==true) {
            System.out.println("Não estou rabiscando!");
        }else{
            System.out.println("Consigo rabiscar!");

        }

    }
    void tampar(){
        this.tampada=true;

    }
    void destampar(){
        this.tampada=false;

    }
}
