/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rev;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Senha {
    public static void main(String[] args) {
        
        //String nomeUsuario = "Silvestre";
        //int senha = 123;
        int senha ;
        String nomeUsuario;
        boolean resultadoNome;
        boolean resultadoSenha;
        
        Scanner ler = new Scanner(System.in);
        
        do{
        System.out.println("Digite o nome do usuário: ");
        nomeUsuario = ler.nextLine();
        
        System.out.println("Digite a senha: ");
        senha = ler.nextInt();
        resultadoNome = nomeUsuario.equals("Silvestre");
        resultadoSenha = (senha == 123);
                if (resultadoNome == true && resultadoSenha == true){
            System.out.println("Bem Vindo!!");
                    }
                else{
            System.out.println("Nome de Usuario ou senha inválidos");
        }
        } while (resultadoNome == false && resultadoSenha == true || resultadoNome == true && resultadoSenha == false);
    }
    
}
