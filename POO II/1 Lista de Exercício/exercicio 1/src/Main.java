import java.util.Scanner;

public class Main {
     static void main (String[]args) {
        Robo r1 = new Robo();
        Scanner sc = new Scanner(System.in);
        int var = -1;

        r1.nome = "WALL-E";
        System.out.println("\n\n WALL-E ligado com sucesso!");

        while (var != 1 && r1.energia > 0){

            System.out.println("\n Digite o comando: \n 1 - Desligar \n 2 - Andar");
            var  = sc.nextInt();

            switch (var){
                case 1:
                    System.out.println(r1.desligar());
                    break;
                case 2:
                    System.out.println(r1.andar());
                    System.out.println("Deseja virar? \n 1 - Direita \n 2 - Esqueda \n 3 - Não");
                        int virar = sc.nextInt();
                            if (virar == 1) System.out.println(r1.virarDireita());
                            else if (virar == 2) System.out.println(r1.virarEsquerda());
                            else if ( virar == 3) System.out.println("Seguindo...");
                            else System.out.println("Valor inválido");
                    break;
                default:
                    System.out.println("Opçao invalida");
            }
        }
        System.out.println(r1.nome + " desligando...");


        sc.close();
    }

}
