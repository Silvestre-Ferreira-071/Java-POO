/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author aluno.den
 */
public class Main {
    public static void main(String[] args) {
        
    
    Cliente cliente = new Cliente("Silvestre", "silvestre@gmail.com", 23);
    
    // sobrepor o valor acima cliente.setIdade(50);
    
    
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getEmail());
        System.out.println("E-mail: " + cliente.getIdade());
    
    }
}
