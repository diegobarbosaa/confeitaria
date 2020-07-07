package controller;

import dao.PedidoDao;
import model.Detalhes_pedido;
import model.Entrega;
import model.Pagamento;
import model.Produto;
import model.Pedido;

public class PedidoController {
    
    public Float pegarValor(Produto produto, Detalhes_pedido detalhes){
        /*
            Metodo para retorno do valor total na tela inicial e para jogar os 
            valores staticos para inserir depois na tabela detalhes_pedido
        */
        
        Float valorTotal = null;
        PedidoDao dao = new PedidoDao();
        Float valor  = dao.pegarValor(produto);
       
        //inserindo valor dentro da vareavel static
        Detalhes_pedido.setPrecoP(valor);
        
        //inserindo na variavel static
        Detalhes_pedido.setQuantidadeP(detalhes.getQuantidade());
        
        //somando valor do produto
        valorTotal = valor * detalhes.getQuantidade();
        
        //inserindo na variavel static 
        Detalhes_pedido.setValor_totalP(valorTotal);
        return valorTotal;
    }   

    public void realizarPedido(Pagamento pagamento, Entrega entrega, model.Pedido pedido) {
         PedidoDao dao = new PedidoDao();
        dao.realizarPedido(pagamento, entrega, pedido);
    }
    
    public void excluirPedido(Pedido pedido){
        PedidoDao dao = new PedidoDao();
        dao.excluirPedido(pedido);
    }      
    
}