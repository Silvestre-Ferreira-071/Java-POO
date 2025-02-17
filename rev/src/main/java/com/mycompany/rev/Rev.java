/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rev;

/**
 *
 * @author aluno.den
 */
public class Rev {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String nome = "Marta";
        String sobrenome = " Silveira";
        
        //Exibindo a quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        
        //Concatenando nome + sobrenome
        String nomeCompleto = nome.concat("").concat(sobrenome);
        
        //Exibindo nome completo usando métodos Strings - Maiúsculas
        System.out.println("Concatenação Maiúsculo : "+ nomeCompleto.toUpperCase());
        
        //Exibindo nome completo usando métodos String - Minusculas 
        System.out.println("Concatenação Minúscula:  "+nomeCompleto.toLowerCase());
        
    }
}
