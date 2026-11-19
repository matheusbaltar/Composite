package com.arch;

public class TesteComposite {
    public static void main(String[] args) {
        KitCervejas kitDegustacao = new KitCervejas("Kit Degustação");
        kitDegustacao.adicionar(new CervejaUnitaria("IPA", 18.90));
        kitDegustacao.adicionar(new CervejaUnitaria("Pilsen", 12.50));

        KitCervejas kitEscuras = new KitCervejas("Kit Escuras");
        kitEscuras.adicionar(new CervejaUnitaria("Stout", 21.00));
        kitEscuras.adicionar(new CervejaUnitaria("Porter", 19.50));

        KitCervejas caixaPresente = new KitCervejas("Caixa Presente");
        caixaPresente.adicionar(kitDegustacao);
        caixaPresente.adicionar(kitEscuras);
        caixaPresente.adicionar(new CervejaUnitaria("Weiss", 16.00));

        caixaPresente.exibir("");
    }
}