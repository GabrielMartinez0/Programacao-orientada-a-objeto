package Exercicios1.ex3;

import javax.swing.JOptionPane;

public class Produto {
    Integer id;
    String descricao;
    Integer qtde;
    float preco;

    // Construtores
    public Produto() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Insira o id do produto"));
        this.descricao = JOptionPane.showInputDialog("Insira a descricao do produto");
        this.qtde = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto"));
        this.preco = Float.parseFloat(JOptionPane.showInputDialog("Insira o preco do produto"));
    }

    public Produto(Integer id, String descricao, Integer qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    // Aumentar ou diminuir o valor unitario
    public void Subir(float valor) {
        alterarPreco(valor);
    }

    public void Subir() {
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do aumento no preço do produto."));
        alterarPreco(valor);
    }

    public void Descer(float valor) {
        alterarPreco(-valor);
    }

    public void Descer() {
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do desconto no preço do produto."));
        alterarPreco(-valor);
    }

    private void alterarPreco(float valor) {
        if (this.preco + valor < 0)
            System.out.println("Seu preco é insuficiente para completar essa transacao");
        else {
            this.preco = this.preco + valor;
            System.out.println("Operaçao bem sucedida!");
        }
        System.out.println(mostra());
    }

    // Aumentar ou diminuir o estoque do produto
    public void comprar(int valor) {
        alterarEstoque(valor);
    }

    public void comprar() {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Voce deseja comprar quantos produtos?"));
        alterarEstoque(valor);
    }

    public void vender(int valor) {
        alterarEstoque(-valor);
    }

    public void vender() {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Voce deseja vender quantos produtos?"));
        alterarEstoque(-valor);
    }

    private void alterarEstoque(int valor) {
        if (this.preco + valor < 0)
            System.out.println("Nao existem produtos suficientes para essa operaçao!");
        else {
            this.preco = this.preco + valor;
            System.out.println("Operaçao bem sucedida!");
        }
        System.out.println(mostra());
    }

    // basicamente um print, so que complicado

    public String mostra() {
        return "ID: " + this.id +
                "\nDescricao: " + this.descricao +
                "\nQuantidade: " + this.qtde +
                "\nValor Unitario: " + this.preco + "\n";
    }
}
