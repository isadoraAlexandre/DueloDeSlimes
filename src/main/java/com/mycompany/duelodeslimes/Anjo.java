package com.mycompany.duelodeslimes;

public class Anjo  extends Ancestral{

    public Anjo() {
    }

    @Override
    public String imprimeTexto() {
        return "Ganha 20% de resistência pelo resto do jogo.";
    }

    @Override
    public void especial(Slime s, Slime alvo) {
        s.setResistencia(s.getResistencia() + (float)0.2);
    }
     
}
