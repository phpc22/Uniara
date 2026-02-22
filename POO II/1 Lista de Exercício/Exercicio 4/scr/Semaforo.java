public class Semaforo {

    String estado;

    public Semaforo() {
        estado = "VERDE";
    }

    void mudarEstado() {

        switch (estado) {

            case "VERDE":
                estado = "AMARELO";
                break;

            case "AMARELO":
                estado = "VERMELHO";
                break;

            case "VERMELHO":
                estado = "VERDE";
                break;
        }
    }

    void mostrarEstado() {
        System.out.println("Estado atual: " + estado);
    }
}