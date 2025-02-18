package Atividade4;

public class MainBanco {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(7, "sILVESTRE", "Rua A","121233", "revoada12@gmail.com",
        new ContaBancaria("Santander", 3255, 112455, "Conta-Corrente", 3.000, 1.500));
        
     System.out.println(funcionario);   
    }
}
