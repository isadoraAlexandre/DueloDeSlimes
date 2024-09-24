package com.mycompany.duelodeslimes;

public class Dragao extends Ancestral {

    public Dragao() {
    }

    @Override
    public String imprimeTexto() {
       return "Ganha 20% de multiplicador de dano e invulnerabilidade por um turno.";
    }

    @Override
    public void especial(Slime s, Slime alvo) {
        s.setInvulneravel(true);
        s.setMultiplicador(s.getMultiplicador() + (float)0.2);
    }
    
}
