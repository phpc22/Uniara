public class Personagem {

    String nome;
    int vida;
    int energia;

    public Personagem(String nome) {
        this.nome = nome;
        vida = 100;
        energia = 100;
    }

    void atacar() {
        if (energia >= 10) {
            energia -= 10;
            System.out.println(nome + " atacou o inimigo!");
        } else {
            System.out.println("Energia insuficiente para atacar!");
        }
    }

    void defender() {
        if (energia >= 5) {
            energia -= 5;
            System.out.println(nome + " está se defendendo!");
        } else {
            System.out.println("Energia insuficiente para defender!");
        }
    }

    void descansar() {
        energia += 15;
        if (energia > 100) {
            energia = 100;
        }
        System.out.println(nome + " está descansando e recuperou energia!");
    }

    void curar(){
        energia -= 10;
        if (vida < 100){
            vida += 10;
        }else{
            System.out.println("Vida cheia!");
        }
    }

    void mostrarStatus() {
        System.out.println("----- STATUS -----");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("------------------");
    }
}