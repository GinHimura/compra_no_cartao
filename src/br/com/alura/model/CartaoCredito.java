package br.com.alura.model;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    List<Produto> produtos;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.produtos = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public boolean lancaCompra(Produto produto) {
        if (this.saldo >= produto.getValorCompra()) {
            this.saldo -= produto.getValorCompra();
            this.produtos.add(produto);
            return true;
        }
        return false;
    }
}
