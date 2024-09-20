/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duelodeslimes;

/**
 *
 * @author isinha
 */
public class Vampiro extends Ancestral{

    public Vampiro() {
    }

    @Override
    public String imprimeTexto() {
        return "Causa 2 de dano e recupera 1 de vida.";
    }

    @Override
    public void especial(Slime s) {
        System.out.println("especial vampiro");
    }
    
    
}
