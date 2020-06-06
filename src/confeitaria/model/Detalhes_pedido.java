package confeitaria.model;

import java.util.ArrayList;

public class Detalhes_pedido {

	private Integer detalhes_pedido;

	private Float preco;

	private int quantidade;

	private Float desconto;

	private Float valor_total;

	private ArrayList<Produto> produtos = new ArrayList<>();

}