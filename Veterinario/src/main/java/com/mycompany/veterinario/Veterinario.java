/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veterinario;

/**
 *
 * @author aluno.den
 */
public class Veterinario {

    public static void main(String[] args) {
        Pet pet = new Pet("xuxu", 5, "Pitbull", "Grande", "Ração");
        Pet pet1 = new Pet("mec", 7, "Pitbull", "Grande", "Ração");
        
        System.out.println("\n == Pet 1 ==");
        System.out.println("Nome do pet: "+ pet.getNome());
        System.out.println("Idade do pet: "+ pet.getIdade());
        System.out.println("Raça do pet: "+ pet.getRaca());
        System.out.println("Porte do pet: "+ pet.getPorte());
        System.out.println("Tipo de aliemtação do pet: "+ pet.getAlimentacao());
        System.out.println("\n == Pet 2 ==");
        System.out.println("Nome do pet: "+ pet1.getNome());
        System.out.println("Idade do pet: "+ pet1.getIdade());
        System.out.println("Raça do pet: "+ pet1.getRaca());
        System.out.println("Porte do pet: "+ pet1.getPorte());
        System.out.println("Tipo de aliemtação do pet: "+ pet1.getAlimentacao());
    }
}
