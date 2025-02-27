package encapsulamento;

public class Cliente1 {
    private String nome;
    private String email;
    private String senha;
    public Cliente1(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    public Cliente1() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nE-mail:" + email + "\nSenha: " + senha;
    }

    
}
