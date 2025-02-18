package encapsulamento;

public class MainCliente {
    public static void main(String[] args) {
        //Passando dados e dando valores para as variaveis
        Cliente1 cliente = new Cliente1("Silvestre", "revoada1@gmail.com", "123");
        Cliente1 cliente2 = new Cliente1("Revoada", "revoada2@gmail.com", "123");
        
        System.out.println("== Dados do  usuário ==");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Senha: " + cliente.getSenha());
            //Exibindo dados
            //System.out.println("\n== Dados do usuário ==" + cliente);
            System.out.println("\n== Dados do usuário ==" + cliente2);
        }
}
