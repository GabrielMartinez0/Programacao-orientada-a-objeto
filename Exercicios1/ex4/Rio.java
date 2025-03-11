package Exercicios1.ex4;

import javax.swing.JOptionPane;

public class Rio {
    String nome;
    Float nivel;
    boolean poluido;

    public Rio() {
        this.nome = JOptionPane.showInputDialog("Insira o nome do rio");
        this.nivel = Float.parseFloat(JOptionPane.showInputDialog("Insira o nivel do rio"));
        this.poluido = JOptionPane.showConfirmDialog(null, "O rio esta poluido?", null, JOptionPane.YES_NO_OPTION) == 0;
        System.out.println(mostra());
    }

    public Rio(String nome, Float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
        System.out.println(mostra());
    }

    public String chover() {
        Float quantChuva = Float.parseFloat(JOptionPane.showInputDialog("Insira a quantidade de chuva"));
        alterarNivel(quantChuva);

        return mostra();
    }

    public String chover(Float quantChuva) {
        alterarNivel(quantChuva);

        return mostra();
    }

    public String ensolarar() {
        Float quantSol = Float.parseFloat(JOptionPane.showInputDialog("Insira a quantidade de sol"));
        alterarNivel(-quantSol);
        return mostra();
    }

    public String ensolarar(Float quantSol) {
        alterarNivel(-quantSol);
        return mostra();
    }

    public void limpar() {
        this.poluido = false;
        System.out.println(mostra());
    }

    public void sujar() {
        this.poluido = true;
        System.out.println(mostra());
    }

    private void alterarNivel(float quantidade) {
        if (this.nivel + quantidade < 0)
            System.out.println("Nao existe agua suficiente para evaporar!");
        else {
            this.nivel = this.nivel + quantidade;
            System.out.println("Operaçao bem sucedida!");
        }
        System.out.println(mostra());
    }

    public String mostra() {
        return "Nome: " + this.nome +
                "\nNivel: " + this.nivel +
                (this.poluido ? "\nO Rio esta poluido" : "\nO Rio nao esta poluido!!") + "\n";
    }
}
