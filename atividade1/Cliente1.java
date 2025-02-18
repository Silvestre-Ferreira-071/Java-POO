package atividade1;

public class Cliente1 {
    
    private String nome;
    private int idade;
    private int cpf;
    private String endereço;
    private int telefone;
    public Cliente1(String nome, int idade, int cpf, String endereço, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereço = endereço;
        this.telefone = telefone;
    }
    
    public Cliente1() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n== Dados do usuário ==\nNome: " + nome + "\nIdade: " + idade + "CPF: " + cpf + "\nEndereço: " + endereço + "\nTelefone: "
                + telefone;
    }

    
}
