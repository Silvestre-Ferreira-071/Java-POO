package Atividade4;

public class ContaBancaria {
    private String banco;
    private int agencia;
    private int numeroConta;
    private String tipoConta;
    private double saldoAtual;
    private double limiteDisponivel;
    public ContaBancaria() {
    }
    public ContaBancaria(String banco, int agencia, int numeroConta, String tipoConta, double saldoAtual,
            double limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public double getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }
    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
    @Override
    public String toString() {
        return "\n== Dados da Conta Bancaria ==\nBanco: " + banco + "\nAgência: " + agencia + "\nNumero da Conta=" + numeroConta
                + "\nTipo da Conta: " + tipoConta + "\nSaldo Atual: " + saldoAtual + "\nLimite Disponivel: " + limiteDisponivel;
    }
    

}
