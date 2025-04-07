import java.util.Scanner;
import java.util.ArrayList;
public class Devolucao {
    static ArrayList<String> devolucao = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void menu(){
        int opcao;
        do {
            System.out.println("\n--- Devolução ---");
            System.out.println("1- Registro de devolução");
            System.out.println("2- Listar devolução");
            System.out.println("3- Atualizar devolução");
            System.out.println("4- Remover devolução");
            System.out.println("0- Voltar");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao){
                case 1-> registrar();
                case 2-> listar();
                case 3-> atualizar();
                case 4-> remover();
                case 0-> System.out.println("Voltar ao menu principal");
                default -> System.out.println("Opção invalida.");
            }
        }while (opcao!=0);
    }
    static void registrar(){
        System.out.println("Nome do funcionário: ");
        String nome = input.nextLine();
        System.out.println("EPI devolvido: ");
        String epi = input.nextLine();
        System.out.println("Data de devolução (dd/mm/aaaa): ");
        String data = input.nextLine();
        String registro = nome + " - "+ epi +" - "+data;
        devolucao.add(registro);
        System.out.println("Devolução registrada com sucesso! ");
    }
    static void listar(){
        System.out.println("\n--- Lista de devolução ---");
        for (int i = 0; i < devolucao.size(); i++){
            System.out.println(i+" - "+devolucao.get(i));
        }
    }
    static void atualizar(){
        listar();
        System.out.println("Informe o índice de devolução a ser atualizado: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < devolucao.size()){
            System.out.println("Novo nome do funcionário: ");
            String nome= input.nextLine();
            System.out.println("Novo EPI devolvido: ");
            String epi = input.nextLine();
            System.out.println("Nova data de devolução (dd/mm/aaaa): ");
            String data = input.nextLine();
            String novoRegistro = nome+" - "+epi+" - "+data;
            devolucao.set(index,novoRegistro);
            System.out.println("Devolução atualizada!");
        }else {
            System.out.println("Índice invalido!");
        }
    }
    static void remover(){
        listar();
        System.out.println("INforme o índice a ser removido: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index<devolucao.size()){
            devolucao.remove(index);
            System.out.println("Devolução removida!");
        }else {
            System.out.println("Índice inválido");
        }
    }
}
