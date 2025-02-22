package proj2;

import javax.swing.JOptionPane;

public class Carro {
    int ano;
    int velocidade;
    String marca;
    String modelo;

    public Carro() {
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do carro: "));
        this.velocidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a Velocidade atual do carro: "));
        this.marca = JOptionPane.showInputDialog("Insira a Marca do carro: ");
        this.modelo = JOptionPane.showInputDialog("Insira o modelo do carro: ");

        detalhes();
    }

    public Carro(int ano, int velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
        detalhes();
    }

    public void acelerar(int acelerado) {
        this.velocidade = Math.max((this.velocidade + acelerado), 0);
        System.out.println(
                "O carro tentou acelerar em " + acelerado + " e sua velocidade final foi de " + this.velocidade);

        detalhes();

    }

    public void desacelerar(int desacelerado) {
        this.velocidade = Math.max((this.velocidade - desacelerado), 0);
        System.out.println(
                "O carro tentou desacelerar em " + desacelerado + " e sua velocidade final foi de " + this.velocidade);
        detalhes();

    }

    public void detalhes() {
        System.out.println("Velocidade:" + this.velocidade +
                "\nAno:" + this.ano +
                "\nMarca" + this.marca +
                "\nModelo: " + this.modelo + "\n\n");

        JOptionPane.showMessageDialog(null, "Velocidade:" + this.velocidade +
                "\nAno:" + this.ano +
                "\nMarca" + this.marca +
                "\nModelo: " + this.modelo);
    }
}
