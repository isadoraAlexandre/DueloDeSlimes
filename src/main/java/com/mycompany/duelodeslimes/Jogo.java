/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duelodeslimes;

import java.util.Scanner;

/**
 *
 * @author isinha
 */
public class Jogo {
    private Slime a;
    private Slime b;

    public Jogo() {
        this.a = new Slime("A");
        this.b = new Slime("B");
    }
    
    private int leitura(){
        
        Scanner t = new Scanner(System.in);
        int num = t.nextInt();
        
        return num;
    }
    
    private Ancestral opcoesAncestral(int n){
        switch (n) {
            case 1:
                return new Vampiro();
            case 2:
                return new Dragao();
            case 3:
                return new Sereia();
            case 4:
                return new Anjo();
            case 5:
                return new Demonio();
            default:
                throw new AssertionError();
        }
    }
    
    private void opcoesHabilidade(int n, Slime s){
        switch (n) {
            case 0:
                break;
            case 0:
                break;
            case 0:
                break;
            case 3:
                ;
            default:
                throw new AssertionError();
        }
    }
    private void imprimeTextoTurno(Slime s){
        System.out.println("""
                               -----------------------------------
                               TURNO DO SLIME """);
        System.out.println(s.getNome() + "-----------------------------------\n");
        System.out.println("Vida atual dos slimes: A: " + a.getVida() + " B: " + b.getVida());
        System.out.println("Digite a habilidade para o slime " + s.getNome() + " usar: (energia restante: " + s.getEnergia() + ")");
        System.out.println("""
                           0: Termina o turno
                           1: Ataque
                           2: Energizar
                           3: Especial: 
                           """ + s.getAncestral().imprimeTexto());
        
    }
    
    public void escolheAncestral(){
        
        System.out.println("Escolha o ancestral do slime A: ");
        a.setAncestral(opcoesAncestral(leitura()));
        
        System.out.println("\nEscolha o ancestral do slime B: ");
        b.setAncestral(opcoesAncestral(leitura()));
    }
    
    public void turno(){
        
        do{
            imprimeTextoTurno(a);
            
        
        }
        while(true);
        
    }
    
    public void jogar(){
        
    }
}
