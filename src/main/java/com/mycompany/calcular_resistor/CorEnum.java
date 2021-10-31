package com.mycompany.calcular_resistor;

public enum CorEnum {

    PRATA(-2),
    OURO(-1),
    PRETO(0),
    MARROM(1),
    VERMELHO(2),
    LARANJA(3),
    AMARELO(4),
    VERDE(5),
    AZUL(6),
    VIOLETA(7),
    CINZA(8),
    BRANCO(9);
    
    private final Integer valor;

    CorEnum(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }
}
