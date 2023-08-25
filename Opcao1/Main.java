
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clientes clientes = new Clientes(); // colocar esses 2 objetos em private dps
        int opcao = 0;
        do {
            System.out.println("=============================================");
            System.out.println("1 - Entrada de cliente");
            System.out.println("2 - Saída de cliente");
            System.out.println("3 - Listar clientes");
            System.out.println("4 - Consultar cliente por CPF");
            System.out.println("5 - Distribuição de clientes por gênero");
            System.out.println("0 - Sair");
            System.out.println("=============================================");
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    entradaCliente(clientes);
                    break;
                case 2:
                    saidaCliente(clientes);
                    break;
                case 3:
                    listarClientes(clientes);
                    break;
                case 4:
                    consultarClientePorCpf(clientes);
                    break;
                case 5:
                    distribuicaoClientesPorGenero(clientes);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }

    public static void entradaCliente(Clientes clientes) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = input.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        String cpf = input.nextLine();
        System.out.println("Digite a idade do cliente: ");
        int idade = input.nextInt();
        System.out.println("Digite o gênero do cliente (M para masculino e F para feminino): ");
        String genero = input.nextLine();
        input.nextLine();
        Cliente cliente = new Cliente(nome, cpf, idade, genero);
        clientes.addCliente(cliente);
    }

    public static void saidaCliente(Clientes clientes) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o CPF do cliente: ");
        String cpf = input.nextLine();
        Cliente cliente = clientes.consultaPorCpf(cpf);
        if (cliente != null) {
            clientes.removeCliente(cliente);
        } else {
            System.out.println("Cliente não encontrado");
        }
    }

    public static void listarClientes(Clientes clientes) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente aux = clientes.get(i);
            System.out.println("Nome: " + aux.getNome());
            System.out.println("CPF: " + aux.getCpf());
            System.out.println("Idade: " + aux.getIdade());
            System.out.println("Gênero: " + aux.getGenero());
            System.out.println("=============================================");
        }
    }

    public static void consultarClientePorCpf(Clientes clientes) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o CPF do cliente: ");
        String cpf = input.nextLine();
        Cliente cliente = clientes.consultaPorCpf(cpf);
        if (cliente != null) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Gênero: " + cliente.getGenero());
            System.out.println("=============================================");
        } else {
            System.out.println("Cliente não encontrado");
        }
    }

    public static void distribuicaoClientesPorGenero(Clientes clientes) {
        int masculino = 0;
        int feminino = 0;
        int outro = 0;
        for (int i = 0; i < clientes.size(); i++) {
            Cliente aux = clientes.get(i);
            if (aux.getGenero().equals("M")) {
                masculino++;
            } else if (aux.getGenero().equals("F")) {
                feminino++;
            } else {
                outro++;
            }
        }
        System.out.println("Masculino: " + masculino);
        System.out.println("Feminino: " + feminino);
        System.out.println("Outro: " + outro);
        System.out.println("=============================================");
    }

}