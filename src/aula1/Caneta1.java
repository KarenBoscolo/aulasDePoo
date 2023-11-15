package aula1;

public class Caneta1 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5;
        c1.tampada = false;
        c1.status();
        c1.destampar();
        c1.rabiscar();

        Caneta c2 = new Caneta("bic", "azul");

    }
}
