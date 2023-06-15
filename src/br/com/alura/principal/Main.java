package br.com.alura.principal;

import br.com.alura.model.CartaoCredito;
import br.com.alura.model.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        var limiteCartao = sc.nextDouble();
        var continuar = 1;
        CartaoCredito cartao = new CartaoCredito(limiteCartao);

        while (continuar != 0) {
            System.out.println("Digite a descrição da compra:");
            var descricao = sc.next();
            System.out.println("Digite o valor da compra:");
            var valorCompra =  sc.nextDouble();

            if (cartao.lancaCompra(new Produto(descricao, valorCompra))) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                continuar = sc.nextInt();
            } else {;
                System.out.println("Saldo insuficiente!");
                continuar = 0;
            }
        }

        System.out.println("""
                
                *****************************************
                COMPRAS REALIZADAS:
                """);
        cartao.getProdutos().sort(Comparator.comparing(Produto::getValorCompra));
        cartao.getProdutos().forEach(System.out::println);
        System.out.println("""
                
                *****************************************
                
                Saldo do cartão: %.2f
                """.formatted(cartao.getSaldo()));
    }
}