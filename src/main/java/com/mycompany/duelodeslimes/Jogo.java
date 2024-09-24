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
                return null;
        }
    }
    
    private void opcoesHabilidade(int n, Slime s, Slime alvo){
        switch (n) {
            case 0:
                break;
            case 1:
                s.ataque(alvo);
                break;
            case 2:
                s.energizar();
                break;
            case 3:
                s.especial(alvo);
                break;
            default:
                break;
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
    
    public boolean turno(Slime s, Slime alvo){
        System.out.println("\n-----------------------------------\nTURNO DO SLIME " + s.getNome() + "\n-----------------------------------\n");
        int habilidade;
        do{
            imprimeTextoTurno(s);
            habilidade = leitura();
            opcoesHabilidade(habilidade, s, alvo);
            
            if(vencedor())
                return true;
            
            System.out.println();
        }
        while(habilidade != 0 && s.getEnergia() > 0 );
        
        if(s.isInvulneravel())
            s.setMultiplicador(s.getMultiplicador() - 2.0);
        
        s.setInvulneravel(false);
        s.setEnergizou(0);
        s.setEnergia(s.getEnergia() + 2);
        return false;
    }
    
    private boolean vencedor(){
        if(this.a.getVida() <= 0.0){
            System.out.println("\n-----------------------------------\nSLIME B VENCEU\n-----------------------------------\n");
            return true;
        }
        else if(this.b.getVida() <= 0.0){
            System.out.println("\n-----------------------------------\nSLIME A VENCEU\n-----------------------------------\n");
            return true;
        }
        else
            return false;
    }
     
    public void jogar(){
        while(true){
            if(turno(a, b))
                break;
            
            if(turno(b, a))
                break;
        }
    }
}
    

