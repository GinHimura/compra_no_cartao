package br.com.alura.model;

public class Produto {
    private String descricao;
    private double valorCompra;

    public Produto(String descricao, double valorCompra) {
        this.descricao = descricao;
        this.valorCompra = valorCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    @Override
    public String toString() {
        return "%s - %.2f".formatted(descricao, valorCompra);
    }
}
