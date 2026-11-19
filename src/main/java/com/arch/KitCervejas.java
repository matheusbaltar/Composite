package com.arch;

import java.util.ArrayList;
import java.util.List;

public class KitCervejas implements ItemCardapio {

    private final String nome;
    private final List<ItemCardapio> itens = new ArrayList<>();

    public KitCervejas(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemCardapio item) {
        itens.add(item);
    }

    public void remover(ItemCardapio item) {
        itens.remove(item);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ItemCardapio item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public void exibir(String recuo) {
        System.out.println(recuo + "+ " + nome + " (total: R$ " + String.format("%.2f", getPreco()) + ")");
        for (ItemCardapio item : itens) {
            item.exibir(recuo + "    ");
        }
    }
}