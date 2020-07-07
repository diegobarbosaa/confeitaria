package model;

import java.util.ArrayList;

public class Detalhes_pedido {

	private Integer detalhes_pedido;

	private Float preco;

	private int quantidade;
        
        private static int quantidadeP;

    
	private Float desconto;

	private Float valor_total;      
       

	private ArrayList<Produto> produtos = new ArrayList<>();
        
         private static Float valor_totalP;
         
         private static Float precoP;

    public static Float getPrecoP() {
        return precoP;
    }

    public static void setPrecoP(Float precoP) {
        Detalhes_pedido.precoP = precoP;
    }

    public static Float getValor_totalP() {
        return valor_totalP;
    }

    public static void setValor_totalP(Float valor_totalP) {
        Detalhes_pedido.valor_totalP = valor_totalP;
    }

        public static int getQuantidadeP() {
        return quantidadeP;
    }

    public static void setQuantidadeP(int quantidadeP) {
        Detalhes_pedido.quantidadeP = quantidadeP;
    }

    public Integer getDetalhes_pedido() {
        return detalhes_pedido;
    }

    public void setDetalhes_pedido(Integer detalhes_pedido) {
        this.detalhes_pedido = detalhes_pedido;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

    public Float getValor_total() {
        return valor_total;
    }

    public void setValor_total(Float valor_total) {
        this.valor_total = valor_total;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

}