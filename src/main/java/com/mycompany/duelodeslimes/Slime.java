package com.mycompany.duelodeslimes;

public class Slime {
    private double vida;
    private double multiplicador;
    private double resistencia;
    private double energia;
    private Ancestral ancestral;
    private String nome;
    private int energizou;
    private double dano;
    private boolean invulneravel;

    public Slime(String nome) {
        this.vida = 10;
        this.multiplicador = 1;
        this.resistencia = 0;
        this.energia = 5;
        this.nome = nome;
        this.energizou = 0;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public Ancestral getAncestral() {
        return ancestral;
    }

    public void setAncestral(Ancestral ancestral) {
        this.ancestral = ancestral;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEnergizou() {
        return energizou;
    }

    public void setEnergizou(int energizou) {
        this.energizou = energizou;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }
    
    public void ataque(Slime recebe){
        System.out.println("ataque");
        
        this.dano = this.multiplicador - recebe.resistencia + this.energizou * 0.5;
        recebe.vida = recebe.vida - this.dano;
        this.energia--;
    }

    public boolean isInvulneravel() {
        return invulneravel;
    }

    public void setInvulneravel(boolean invulneravel) {
        this.invulneravel = invulneravel;
    }
    
    public void energizar(){
        if(this.energia >= 0.0){
            this.energia = this.energia - 2;
            this.energizou = 1;
        }
    }
    
    public void especial(Slime alvo){
        if(this.energia >= 0.0){
            this.ancestral.especial(this, alvo);
            this.energia = this.energia - 4;
        }
    }
    
    
}
