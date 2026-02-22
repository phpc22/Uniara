import java.util.Scanner;

public class Pedido {

    Scanner sc = new Scanner(System.in);
    Pizza p1 = new Pizza();
    double total = 0;
    int quantidade = 0;

    String order() {

        System.out.println("Olá, digite seu pedido:");

        for (quantidade = 1; quantidade <= 5; quantidade++) {

            System.out.println("Pizza " + quantidade + " de 5");
            p1.menu();

            int ped = sc.nextInt();

            if (ped == 0) {
                break;
            }

            switch (ped) {

                case 1:
                    p1.preco = 30;
                    p1.sabuuuor = "Mussarela";
                    break;

                case 2:
                    p1.preco = 32;
                    p1.sabuuuor = "Calabresa";
                    break;

                case 3:
                    p1.preco = 35;
                    p1.sabuuuor = "Portuguesa";
                    break;

                case 4:
                    p1.preco = 36;
                    p1.sabuuuor = "Frango com Catupiry";
                    break;

                case 5:
                    p1.preco = 38;
                    p1.sabuuuor = "Quatro Queijos";
                    break;

                case 6:
                    p1.preco = 8;
                    p1.sabuuuor = "Refrigerante";
                    break;

                case 7:
                    p1.preco = 7;
                    p1.sabuuuor = "Suco";
                    break;

                case 8:
                    p1.preco = 34;
                    p1.sabuuuor = "Marguerita";
                    break;

                case 9:
                    p1.preco = 33;
                    p1.sabuuuor = "Napolitana";
                    break;

                case 10:
                    p1.preco = 37;
                    p1.sabuuuor = "Bacon";
                    break;

                case 11:
                    p1.preco = 36;
                    p1.sabuuuor = "Atum";
                    break;

                case 12:
                    p1.preco = 35;
                    p1.sabuuuor = "Palmito";
                    break;

                case 13:
                    p1.preco = 38;
                    p1.sabuuuor = "Brócolis com Bacon";
                    break;

                case 14:
                    p1.preco = 34;
                    p1.sabuuuor = "Milho com Catupiry";
                    break;

                case 15:
                    p1.preco = 40;
                    p1.sabuuuor = "Carne Seca";
                    break;

                case 16:
                    p1.preco = 39;
                    p1.sabuuuor = "Mexicana";
                    break;

                case 17:
                    p1.preco = 36;
                    p1.sabuuuor = "Toscana";
                    break;

                case 18:
                    p1.preco = 32;
                    p1.sabuuuor = "Chocolate";
                    break;

                case 19:
                    p1.preco = 31;
                    p1.sabuuuor = "Banana com Canela";
                    break;

                default:
                    System.out.println("Opção inválida!");
                    quantidade--;
                    continue;
            }

            total += p1.preco;

            System.out.println("Adicionado: " + p1.sabuuuor);
            System.out.println("Subtotal: R$ " + total);
            System.out.println("----------------------------");
        }

        return "Pedido finalizado!\nTotal a pagar: R$ " + total;
    }
}