/*
 * aqui eh um teste
 */
package com.mycompany.duelodeslimes;

/**
 *
 * @author isinha
 */
public class DueloDeSlimes {

    public static void main(String[] args) {
        
        Jogo jogo = new Jogo();
        System.out.println("""
                           Bem-vindo ao jogo de slimes
                           
                           Regras:
                           
                           Cada slime comeca com 10 de vida e 5 de energia
                           
                           Cada slime tem 3 habilidades ativadas pelos seguintes comandos:
                           0: Termina o turno
                           1: Ataque
                           2: Energizar
                           3: Especial
                           Cada jogador pode escolher o ancestral do slime no comeco do jogo
                           
                           Os Ancestrais disponiveis sao:
                           1 - Vampiro
                           2 - Dragao
                           3 - Sereia
                           4 - Anjo
                           5 - Demonio
                           
                           """);
        jogo.escolheAncestral();
        
        System.out.println("""
                           \n-----------------------------------
                           INICIADO O JOGO
                           -----------------------------------""");
        jogo.jogar();
    }
    
}
