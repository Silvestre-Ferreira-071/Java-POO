/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.Locale;

/**
 *
 * @author aluno.den
 */
public class Biblioteca {

    public static void main(String[] args) {
        Livro livro = new Livro("Como fazer amigos e influenciar pessoas", "Dale Carnegie", 264, 70.00,123);
        // Livro livro2 = new Livro("Revoada", "Silvestre", 100, 50.00,123);
        Veiculo veiculo = new Veiculo("PKT00", "Vermelho", 5, 40, 120, 3.7);
        
        System.out.println("\n=== Livro ===");
        System.out.println("Titulo: "+ livro.getTitulo());
        System.out.println("Autor: "+ livro.getAutor());
        System.out.println("Numero de Páginas: "+ livro.getNumeroDePaginas());
        System.out.println("Preço: "+ livro.getPreco());
        System.out.println("ISBN: "+ livro.getIsbn());
        
        System.out.println("\n == Veiculo ==");
        System.out.println("Placa: "+veiculo.getPlaca());
        System.out.println("Placa: "+veiculo.getCor());
        System.out.println("Placa: "+veiculo.getNumeroDePassageiros());
        System.out.println("Placa: "+veiculo.getCapacidadeDeTanque());
        System.out.println("Placa: "+veiculo.getVelocidadeMaxima());
        System.out.println("Placa: "+veiculo.getConsumoMedio());
    }
}
