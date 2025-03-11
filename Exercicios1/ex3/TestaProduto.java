package Exercicios1.ex3;

public class TestaProduto {
    public static void main(String[] args) {
        Produto banana = new Produto();
        Produto bergamota = new Produto(200, "Tambem conhecida como mexerica ou tangerina", 199, 2);

        banana.Descer();
        bergamota.Descer(1);

        banana.Subir(5);
        bergamota.Subir();

        bergamota.comprar(200);
        banana.comprar();

        bergamota.vender();
        banana.vender(20);
    }
}
