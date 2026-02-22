public class Transito {

    public static void main(String[] args) throws InterruptedException{

        Semaforo s = new Semaforo();

        for (int i = 1; i <= 10; i++) {

            System.out.println("Ciclo " + i);

            //verde
            s.mostrarEstado();
            Thread.sleep(4000); //-> 4 segundos
            s.mudarEstado();

            //amaerlo
            s.mostrarEstado();
            Thread.sleep(3000); //-> 3 segundos
            s.mudarEstado();

            //vermelho
            s.mostrarEstado();
            Thread.sleep(5000); //->5 segundos
            s.mudarEstado();

            System.out.println("----------------------");
        }
    }
}