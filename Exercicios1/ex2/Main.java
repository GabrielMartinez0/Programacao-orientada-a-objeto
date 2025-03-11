package Exercicios1.ex2;

public class Main {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(53123, 256, "Fulano", 1010);
        fulano.realizarDeposito();
        fulano.realizarSaque();

        Cliente beltrano = new Cliente(53124, 254, "Beltrano", 50204);
        beltrano.realizarDeposito();
        beltrano.realizarSaque();
    }
}
