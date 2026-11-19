package com.arch;

public class CervejaUnitaria implements ItemCardapio {

    private final String nome;
    private final double preco;

    public CervejaUnitaria(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void exibir(String recuo) {
        System.out.println(recuo + "- " + nome + ": R$ " + String.format("%.2f", preco));
    }
}