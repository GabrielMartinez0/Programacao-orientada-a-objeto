package Exercicios1.ex1;

import javax.swing.JOptionPane;

public class Aluno {
    int numeroAluno;
    int idade;
    String nome;
    float p1;
    float p2;

    public Aluno() {
        this.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do aluno"));
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do aluno"));
        this.nome = JOptionPane.showInputDialog("Insira o nome do aluno");
        this.p1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da P1"));
        this.p2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da P2"));
    }

    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String dadosAluno() {
        return "Numero: " + this.numeroAluno +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade;
    }

    public float notaFinal() {
        // nao era pra ser tao dificil arredondar 2 casas
        return (float) Math.round((this.p1 + this.p2) / 2 * 10) / 10;
    }

    public String passou() {
        return ((this.p1 + this.p2) / 2 >= 6 ? "Aprovado" : "Reprovado");

    }

}
