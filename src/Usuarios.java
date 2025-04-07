import java.util.Scanner;
import java.util.ArrayList;
public class Usuarios {
    private String nome;
    private String funcao;
    public Usuarios(String nome, String funcao) {
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    static ArrayList<String> usuarios = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        int opcao;
        do {
            System.out.println("\n---Usuários---");
            System.out.println("1 Cadastrar usuário");
            System.out.println("2 Listar usuários");
            System.out.println("3 Atualizar usuário");
            System.out.println("4 Remover usuário");
            System.out.println("0 Sair");
            System.out.println("Escolha: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> cadasrar();
                case 2 -> listar();
                case 3 -> atualizar();
                case 4 -> remover();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção invalida!");
            }
        } while (opcao != 0);
    }

    private static void cadasrar() {
        System.out.println("Insira o nome do novo usuário: ");
        String nome = input.nextLine();
        System.out.println("Informe a função: ");
        String funcao = input.nextLine();
        String usuario = nome + " - " + funcao;
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    static void listar() {
        System.out.println("\n---Lista de Usuários---");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(i + "-" + usuarios.get(i));
        }
    }

    static void atualizar() {
        listar();
        System.out.println("Informe o indice a ser atualizado");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < usuarios.size()){
            System.out.println("Digite o novo nome: ");
            String novoNome = input.nextLine();
            System.out.println("insira nova função: ");
            String novaFuncao = input.nextLine();
            String novoUsuario = novoNome + " - " + novaFuncao;
            usuarios.set(index,novoUsuario);
            System.out.println("Nome e função atualizados!");
        }else{
            System.out.println("Índice inválido!");
        }
    }
    static void remover(){
        listar();
        System.out.println("Informe o indice a ser removido: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index< usuarios.size()){
            usuarios.remove(index);
            System.out.println("Usuário Removido! ");
        }else{
            System.out.println("Índice invalido!");
        }
    }
}

