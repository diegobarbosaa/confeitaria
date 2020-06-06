package confeitaria.model;

import java.util.Date;

public class Pedido {

	private Integer pedido_id;

	private String status_pedido;

	private Date data_entrega;

	private Date data_pedido;

	private Cliente cliente;

	private Entrega entrega;

	private Pagamento pagamento;

	private Cliente cliente_pedido;

}
