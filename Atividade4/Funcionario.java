package Atividade4;

public class Funcionario {
    private int codigoFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBanco;
    public Funcionario() {
    }
    public Funcionario(int codigoFuncionario, String nome, String endereco, String telefone, String email,
            ContaBancaria contaBanco) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }
    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ContaBancaria getContaBanco() {
        return contaBanco;
    }
    public void setContaBanco(ContaBancaria contaBanco) {
        this.contaBanco = contaBanco;
    }
    @Override
    public String toString() {
        return "\n== Dados do Funcionario ==\nCodigo do Funcionário: " + codigoFuncionario + "\nNome: " + nome + "\nEndereço: " + endereco
                + "\nTelefone: " + telefone + ", email=" + email + "" + contaBanco.toString();
    }
    
}
