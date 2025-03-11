package Exercicios1.ex2;

import javax.swing.JOptionPane;

public class Cliente {
    Integer numeroConta;
    Integer numeroAgencia;
    String nome;
    float saldo;

    public Cliente() {
        this.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da conta"));
        this.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade da agencia"));
        this.nome = JOptionPane.showInputDialog("Insira o seu nome");
        this.saldo = Float.parseFloat(JOptionPane.showInputDialog("Insira o saldo atual"));
    }

    public Cliente(Integer numeroConta, Integer numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float valor) {
        alterarSaldo(valor);
    }

    public void realizarDeposito() {
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor que deseja depositar"));
        alterarSaldo(valor);
    }

    public void realizarSaque(float valor) {
        alterarSaldo(-valor);
    }

    public void realizarSaque() {
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor que deseja Sacar"));
        alterarSaldo(-valor);
    }

    private void alterarSaldo(float valor) {
        if (this.saldo + valor < 0)
            System.out.println("Seu saldo é insuficiente para completar essa transacao");
        else {
            this.saldo = this.saldo + valor;
            System.out.println("Operaçao bem sucedida!");
        }
        System.out.println(detalhes());
    }

    public String detalhes() {
        return "A conta nº" + this.numeroConta +
                " de " + this.nome +
                "\nAtualmente tem R$" + this.saldo + "\n";
    }
}
