import java.util.ArrayList;
import java.util.Scanner;
public class EPI {
    static ArrayList<String> epis=new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void menu(){
        int opcao;
        do {
            System.out.println("\n---Sistema de EPIs---");
            System.out.println("1 Cadastrar EPI");
            System.out.println("2 Listar EPIs");
            System.out.println("3 Atualizar EPIs");
            System.out.println("4 Remover EPI");
            System.out.println("0 Sair");
            System.out.println("Escolha: ");
            opcao=input.nextInt();
            input.nextLine();
            switch (opcao){
                case 1 -> cadastrarEPI();
                case 2 -> listarEPIs();
                case 3 -> atualizarEPI();
                case 4 -> removerEPI();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção invalida!");
            }
        }while (opcao != 0);
    }
    static void cadastrarEPI(){
        System.out.println("Digite o nome do EPI: ");
        String nome = input.nextLine();
        epis.add(nome);
        System.out.println("EPI cadastrado com sucesso!");
    }
    static void listarEPIs(){
        System.out.println("\n---Lista de EPIs---");
        for (int i = 0; i < epis.size(); i++){
            System.out.println(i+"-"+epis.get(i));
        }
    }
    static void atualizarEPI(){
        listarEPIs();
        System.out.println("Digite índice do EPI a ser atualizado:");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < epis.size()){
            System.out.println("Digite o novo nome: ");
            String novoNome = input.nextLine();
            epis.set(index,novoNome);
            System.out.println("EPI atualizado!");
        }else{
            System.out.println("Índice inválido!");
        }
    }
    static void removerEPI(){
        listarEPIs();
        System.out.println("Digite o índice do EPI a ser removido: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index< epis.size()){
            epis.remove(index);
            System.out.println("EPI Removido! ");
        }else{
            System.out.println("Índice invalido!");
        }
    }
}