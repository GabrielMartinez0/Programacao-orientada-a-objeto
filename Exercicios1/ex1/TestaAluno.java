package Exercicios1.ex1;

import java.util.Random;

public class TestaAluno {
    static String[] nomesPossiveis = { "João", "Maria", "Carlos", "Ana", "Pedro", "Luciana", "Miguel", "Sofia",
            "Rafael", "Gabriela", "Eduardo", "Juliana", "Felipe", "Beatriz", "Ricardo", "Fernanda", "Diego", "Mariana",
            "Bruno", "Carolina", "André", "Patrícia", "Lucas", "Amanda", "Gustavo", "Daniela", "Matheus", "Camila",
            "Thiago", "Natália", "Vitor", "Larissa", "Paulo", "Isabela", "Leonardo", "Letícia", "Alexandre", "Bianca",
            "Rodrigo", "Vanessa", "Francisco", "Mônica", "Marcelo", "Jéssica", "Roberto", "Tatiana", "Henrique",
            "Renata" };

    public static void main(String[] args) {
        Random rn = new Random();

        int numero = rn.nextInt(256);
        String nome = nomesPossiveis[rn.nextInt(nomesPossiveis.length)];
        int idade = rn.nextInt(100);

        float p1 = rn.nextFloat(10);
        float p2 = rn.nextFloat(10);

        Aluno teste = new Aluno(numero, idade, nome, p1, p2);

        System.out.println("Dados do aluno gerado\n" + teste.dadosAluno());
        System.out.println("Nota final do aluno foi: " + teste.notaFinal());
        System.out.println("O aluno gerado foi: " + teste.passou());
    }
}
