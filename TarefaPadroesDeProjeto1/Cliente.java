package br.com.smorais;

public class Cliente {

    public static void main(String[] args) {
        FabricaDeCarro fabricaSedan = new FabricaSedan();
        Carro sedan = fabricaSedan.criarCarro();
        sedan.exibirInfo();

        FabricaDeCarro fabricaSUV = new FabricaSUV();
        Carro SUV = fabricaSUV.criarCarro();
        SUV.exibirInfo();

        FabricaDeCarro fabricaHatchback = new FabricaHondaCivic();
        Carro hatchback = fabricaHatchback.criarCarro();
        hatchback.exibirInfo();
    }
}
