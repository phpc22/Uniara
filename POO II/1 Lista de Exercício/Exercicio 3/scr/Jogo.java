import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do personagem:");
        String nome = sc.nextLine();

        Personagem p = new Personagem(nome);

        while (p.vida > 0) {

            p.mostrarStatus();

            System.out.println("Escolha uma ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            System.out.println("3 - Descansar");
            System.out.println("4 - Curar");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    p.atacar();
                    break;

                case 2:
                    p.defender();
                    break;

                case 3:
                    p.descansar();
                    break;

                case 4:
                    p.curar();
                    break;


                case 0:
                    System.out.println("Saindo do jogo...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }

            p.vida -= 5;

            System.out.println();
        }

        System.out.println("Game Over! O personagem ficou sem vida.");
    }
}