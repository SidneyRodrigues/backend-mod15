package br.com.smorais;

public class FabricaSedan implements FabricaDeCarro{
    @Override
    public Carro criarCarro() {
        return new Sedan();
    }
}

class FabricaSUV implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new SUV();
    }
}

class FabricaHondaCivic implements FabricaDeCarro {
    @Override
    public Carro criarCarro() {
        return new HondaCivic();
    }
}
