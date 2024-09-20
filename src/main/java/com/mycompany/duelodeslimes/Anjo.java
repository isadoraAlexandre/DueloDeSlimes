/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duelodeslimes;

/**
 *
 * @author isinha
 */
public class Anjo  extends Ancestral{

    public Anjo() {
    }

    @Override
    public String imprimeTexto() {
        return "Ganha 0.2 de resistência pelo resto do jogo.";
    }

    @Override
    public void especial(Slime s) {
        System.out.println("especial anjo");
        s.setResistencia(s.getResistencia() + (float)0.2);
    }
     
}
