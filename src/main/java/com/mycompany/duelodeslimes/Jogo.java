package com.mycompany.duelodeslimes;

import java.util.Scanner;

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
                throw new AssertionError("opcao nao existe");
        }
    }
    
    private void opcoesHabilidade(int n, Slime s){
        switch (n) {
            case 0:
                break;
            case 1:
                s.ataque(s);
                break;
            case 2:
                s.energizar();
                break;
            case 3:
                s.especial();
                break;
            default:
                throw new AssertionError();
        }
    }
    private void imprimeTextoTurno(Slime s){
        
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
    
    public void turno(Slime s){
        System.out.println("\n-----------------------------------\nTURNO DO SLIME " + s.getNome() + "\n-----------------------------------\n");
        int h;
        do{
            imprimeTextoTurno(s);
            h = leitura();
            opcoesHabilidade(h, s);
            System.out.println();
        }
        while(h != 0 && s.getEnergia() >= 0);
            
    }
     
    public void jogar(){
        do{
            turno(a);
            turno(b);
        }
        while(a.getVida() <= 0 || b.getVida() <= 0);
    }
}
    

