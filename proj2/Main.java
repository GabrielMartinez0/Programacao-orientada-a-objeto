package proj2;

public class Main {
    public static void main(String[] args) {

        Carro obj1 = new Carro();
        obj1.velocidade = 25;
        obj1.acelerar(255);

        Carro obj2 = new Carro(2020, 0, "honda", "Civic");

        obj2.detalhes();
    }
}
