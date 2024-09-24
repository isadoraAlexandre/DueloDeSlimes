package com.mycompany.duelodeslimes;

public class Vampiro extends Ancestral{

    public Vampiro() {
    }

    @Override
    public String imprimeTexto() {
        return "Causa 2 de dano e recupera 1 de vida.";
    }

    @Override
    public void especial(Slime s, Slime alvo) {
        s.setDano(2.0);
        alvo.setVida(alvo.getVida() - 2.0);
        s.setVida(s.getVida() + 1.0);
    }
    
    
}
