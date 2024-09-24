package com.mycompany.duelodeslimes;

public class Demonio extends Ancestral{

    public Demonio() {
    }

    @Override
    public String imprimeTexto() {
        return "Ganha 20% de multiplicador de dano pelo resto do jogo.";
    }

    @Override
    public void especial(Slime s, Slime alvo) {
        s.setMultiplicador(s.getMultiplicador() + (float)0.2);
    }
    
    
}
