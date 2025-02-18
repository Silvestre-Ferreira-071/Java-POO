package Atividade2;

public class Cliente2{
    
    private String nome;
    private String idade;
    private Endereco endereco;

    public Cliente2() {
    }


    public Cliente2(String nome, String idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente2 [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco.toString() + "]";
    }
    

}
