/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duelodeslimes;

/**
 *
 * @author isinha
 */
public class Slime {
    private float vida;
    private float multiplicador;
    private float resistencia;
    private float energia;
    private Ancestral ancestral;
    private String nome;

    public Slime(String nome) {
        this.vida = 10;
        this.multiplicador = 1;
        this.resistencia = 0;
        this.energia = 5;
        this.nome = nome;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(float multiplicador) {
        this.multiplicador = multiplicador;
    }

    public float getResistencia() {
        return resistencia;
    }

    public void setResistencia(float resistencia) {
        this.resistencia = resistencia;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
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
    
    
    
    public void ataque(Slime s){
        float dano = this.multiplicador - s.resistencia + energia;
    }
    
    public void energizar(){
        
    }
    
    public void especial(){
        
    }
    
    
}
