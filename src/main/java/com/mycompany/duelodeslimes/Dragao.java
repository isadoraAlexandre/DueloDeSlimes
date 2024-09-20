/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duelodeslimes;

/**
 *
 * @author isinha
 */
public class Dragao extends Ancestral {

    public Dragao() {
    }

    @Override
    public String imprimeTexto() {
       return "Ganha 0.2 de multiplicador de dano e invulnerabilidade por um turno.";
    }

    @Override
    public void especial(Slime s) {
        System.out.println("especial dagrao");
    }
    
}
