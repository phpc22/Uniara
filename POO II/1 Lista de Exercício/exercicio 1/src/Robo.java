public class Robo {
    String nome;
    int energia = 100;
    boolean ligado = true;


   /* String ligar() {
        ligado = true;
         return nome + " ligado!";
    }*/

    String desligar() {
        ligado = false;
        return nome + " desligado!";
    }

    String andar() {
        if (ligado && energia > 0){
            energia -= 10;
            return nome + " andando... Energia: " + energia;

        } else{
            return "Necessario" + nome + "ligado!";
        }
    }
    String virarEsquerda() {
        energia -= 10;
        return nome + " virando para esquerda! Energia: " + energia;
    }

    String virarDireita() {
        energia -= 10;
        return nome + "virando para direita! Energia: " + energia;
    }





}