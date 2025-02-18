package atividade1;

public class Veiculo1 {
    private String placa;
    private String cor;
    private int numeroDePassageiros;
    private double capacidadeTanque;
    private int velocidadeMaxima;
    private double consumoMedio;
    public Veiculo1(String placa, String cor, int numeroDePassageiros, double capacidadeTanque, int velocidadeMaxima,
            double consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }
    public Veiculo1() {
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }
    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getConsumoMedio() {
        return consumoMedio;
    }
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    @Override
    public String toString() {
        return "\n== Dados do Veiculo ==\nPlaca: " + placa + "\nCor: " + cor + "\nNumero de Passageiros: " + numeroDePassageiros
                + "\nCapacidade de Tanque: " + capacidadeTanque +"Litros"+ "\nVelocidade Máxima: " + velocidadeMaxima + "Km/h"
                + "\nConsumo Médio: " + consumoMedio + "L por km";
    }
    

}
