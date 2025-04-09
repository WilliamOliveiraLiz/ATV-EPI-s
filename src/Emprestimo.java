import java.util.Scanner;

public class Emprestimo {
    static Scanner input = new Scanner(System.in);
    public static void menu(){
        int opcao;
        do{
            System.out.println("\n--- Empréstimos ---");
            System.out.println("1- Cadastrar Empréstimo");
            System.out.println("2- Listar Empréstimos");
            System.out.println("3- Atualizar Empréstimo");
            System.out.println("4- Remover Empréstimo");
            System.out.println("0- Voltar");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao){
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> atualizar();
                case 4 -> remover();
                case 0 -> System.out.println("Voltar para menu principal.");
                default -> System.out.println("Opção invalida.");
            }
        }while (opcao !=0);
    }
    static void cadastrar(){
            System.out.println("Nome do funcionário: ");
            String nome = input.nextLine();
            System.out.println("EPI emprestado: ");
            String epi = input.nextLine();
            System.out.println("Data do empréstimo (dd/mm/aaaa): ");
            String data = input.nextLine();
            String registro = nome+" - "+epi+" - "+data;
            BancoDados.registro.add(registro);
            System.out.println("Emp´rstimo realizado com sucesso!");
    }
    static void listar() {
        System.out.println("\n--- Lista de Empréstimos ---");
        for (int i = 0; i < BancoDados.registro.size(); i++){
            System.out.println(i+" - "+ BancoDados.registro.get(i));
        }
    }
    static void atualizar(){
        listar();
        System.out.println("digite o índice a ser atualizado: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < BancoDados.registro.size()){
            System.out.println("Novo nome do funcionário: ");
            String nome = input.nextLine();
            System.out.println("Novo EPI emprestado: ");
            String epi = input.nextLine();
            System.out.println("Nova data de empréstimo: ");
            String data = input.nextLine();
            String novoRegistro = nome +" - "+epi+" - "+data;
            BancoDados.registro.set(index,novoRegistro);
            System.out.println("Empréstimo atualizado! ");
        }else {
            System.out.println("Índice inválido! ");
        }
    }
    static void remover(){
        listar();
        System.out.println("Informe o índice a ser removido.");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < BancoDados.registro.size()){
            BancoDados.registro.remove(index);
            System.out.println("Empréstimo removido.");
        }else {
            System.out.println("Índice inválido.");
        }
    }
}
