//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1- Usuários");
            System.out.println("2- EPIs");
            System.out.println("3- Empréstimos");
            System.out.println("4- Devoluções");
            System.out.println("0- Sair");
            opcao=input.nextInt();
            switch (opcao){
                case 1-> Usuarios.menu();
                case 2-> EPI.menu();
                case 3-> Emprestimo.menu();
                case 4-> Devolucao.menu();
                case 0-> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida");
            }
        }while (opcao!=0);
    }
}