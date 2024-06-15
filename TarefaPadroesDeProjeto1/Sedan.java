package br.com.smorais;

public class Sedan implements Carro{
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Sedan");
    }
}

class SUV implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: SUV");
    }
}

class HondaCivic implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Honda Civic");
    }
}
