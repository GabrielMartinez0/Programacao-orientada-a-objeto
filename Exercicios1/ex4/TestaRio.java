package Exercicios1.ex4;

public class TestaRio {
    public static void main(String[] args) {
        Rio negro = new Rio();
        Rio solimoes = new Rio("Solimoes", 1000f, false);

        negro.ensolarar();
        negro.ensolarar(200f);
        negro.chover(2000f);
        negro.chover();
        negro.limpar();
        solimoes.sujar();
    }
}
