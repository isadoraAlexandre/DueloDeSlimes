package com.mycompany.duelodeslimes;

public class Sereia extends Ancestral {

    public Sereia() {
    }

    @Override
    public String imprimeTexto() {
        return "Fica com 2 de energia para zerar a energia do alvo (precisa de 6 de energia para usar).";
    }

    @Override
    public void especial(Slime s, Slime alvo) {
        if(s.getEnergia() >= 6){
            s.setEnergia(2.0);
            alvo.setEnergia(0.0);
        }
    }
     
}
