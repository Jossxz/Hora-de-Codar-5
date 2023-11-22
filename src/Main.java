import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 1 Atividade
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estudantes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do estudante (ou 'PARE' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("PARE")) {
                break;
            }

            estudantes.add(nome);
        }

        int quantidadeEstudantes = estudantes.size();

        System.out.println("\nQuantidade de estudantes cadastrados: " + quantidadeEstudantes);
        System.out.println("Lista de estudantes cadastrados:");

        for (String estudante : estudantes) {
            System.out.println(estudante);
        }

        scanner.close(); */
        /* 2 atividade
        // Criando uma array de planetas
        String[] planetas = {"Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"};

        // Criando um Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário que digite o nome de um planeta
        System.out.print("Digite o nome de um planeta: ");
        String planetaUsuario = scanner.nextLine();

        // Verificando se o planeta informado pelo usuário está na array
        boolean planetaEncontrado = false;
        for (String planeta : planetas) {
            if (planeta.equalsIgnoreCase(planetaUsuario)) {
                planetaEncontrado = true;
                break;
            }
        }

        // Exibindo o resultado para o usuário
        if (planetaEncontrado) {
            System.out.println("O planeta está na lista!");
        } else {
            System.out.println("O planeta não está na lista.");
        }
        // Fechando o Scanner
        scanner.close();
            /* 3 atividade
                // Criando uma array de frutas
                ArrayList<String> frutas = new ArrayList<>();
                frutas.add("Maçã");
                frutas.add("Banana");
                frutas.add("Uva");
                frutas.add("Pêra");
                frutas.add("Melancia");

                // Criando um Scanner para receber a entrada do usuário
                Scanner scanner = new Scanner(System.in);

                // Exibindo a lista de frutas ao usuário
                System.out.println("Lista de frutas disponíveis:");
                for (String fruta : frutas) {
                    System.out.println(fruta);
                }

                // Removendo frutas até que a lista esteja vazia
                while (!frutas.isEmpty()) {
                    // Pedindo ao usuário que digite o nome de uma fruta
                    System.out.print("\nDigite o nome de uma fruta para remoção (ou 'PARE' para finalizar): ");
                    String frutaUsuario = scanner.nextLine();

                    // Verificando se a fruta está na lista
                    if (frutas.contains(frutaUsuario)) {
                        frutas.remove(frutaUsuario);
                        System.out.println("Fruta foi retirada da lista.");
                    } else if (frutaUsuario.equalsIgnoreCase("PARE")) {
                        break; // Finalizando o loop se o usuário digitar 'PARE'
                    } else {
                        System.out.println("Fruta indisponível no nosso mercado.");
                    }

                    // Verificando se a lista está vazia
                    if (frutas.isEmpty()) {
                        System.out.println("Lista de compras finalizada.");
                    }
                }

                // Fechando o Scanner
                scanner.close(); */
            }
        }
