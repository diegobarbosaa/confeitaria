package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import model.Detalhes_pedido;
import model.Entrega;
import model.Login;
import model.Pagamento;
import model.Produto;
import model.Pedido;

public class PedidoDao {
    
    public Float pegarValor(Produto produto) {
        Float valor = null;
        try(Connection con = new ConnectionDataBase().getConnection()){
            String sql = "SELECT produto_id, preco_unitario FROM produto WHERE produto_nome = '"+produto.getProduto_nome()+"'";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
              Produto.setIdProduto(rs.getInt("produto_id"));
              produto.setPreco_unitario(rs.getFloat("preco_unitario"));
            }
            
            valor = produto.getPreco_unitario();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
        return valor;
    }    
    
    public void realizarPedido(Pagamento pagamento, Entrega entrega, Pedido pedido){
              
        try(Connection con = new ConnectionDataBase().getConnection()){
            String sql = "INSERT INTO pedido (cliente_id, pagamento_id, entrega_id, status_pedido,"
                    + "data_entrega, data_pedido) VALUE(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, Login.getIdCliente());
            stmt.setInt(2, pagamento.getPagamento_id());
            stmt.setInt(3, entrega.getEntrega_id());
            stmt.setString(4, pedido.getStatus_pedido());
            stmt.setString(5, "2020-09-20");
            // Pegando a data do dia
            java.sql.Date dataParaGravar = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
            stmt.setDate(6, dataParaGravar);
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs != null && rs.next()){
                pedido.setPedido_id(rs.getInt(1));
            }
            
            String sql1 = "INSERT INTO detalhes_pedido (pedido_id, produto_id, quantidade, preco, desconto, valor_total"
                    + ") VALUE(?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql1);
            stmt.setInt(1, pedido.getPedido_id());
            stmt.setInt(2, Produto.getIdProduto());
            stmt.setInt(3, Detalhes_pedido.getQuantidadeP());
            stmt.setFloat(4, Detalhes_pedido.getPrecoP());
            stmt.setFloat(5, 0);
            stmt.setFloat(6, Detalhes_pedido.getValor_totalP());
            stmt.execute();
            stmt.close();
            rs.close();
            
            JOptionPane.showMessageDialog(null, "Pedido feito com sucesso!");
            
        }catch(SQLException e){
            throw new RuntimeException (e);
        }
        
    }
    
    public ArrayList<Pedido> consultarPedido(){
        ArrayList<Pedido> pedido = new ArrayList<Pedido>();
        
        try(Connection con = new ConnectionDataBase().getConnection()){
            String sql =  "SELECT pedido_id, status_pedido, data_entrega, data_pedido FROM pedido WHERE "
                    + "cliente_id = '"+Login.getIdCliente()+"'";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Pedido pedido1 = new Pedido();
                pedido1.setPedido_id(rs.getInt("pedido_id"));
                pedido1.setStatus_pedido(rs.getString("status_pedido"));
                pedido1.setData_pedido(rs.getDate("data_pedido"));
                pedido1.setData_entrega(rs.getDate("data_pedido"));
                
                pedido.add(pedido1);
            }    
            
            
        }catch(SQLException e){
            throw new RuntimeException (e);
        }

        return pedido;
    }
    
    public void excluirPedido(Pedido pedido){
        
        try(Connection con = new ConnectionDataBase().getConnection()){
            
            String sql = "DELETE FROM pedido WHERE pedido_id = "+pedido.getPedido_id()+"";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            
            
            
            JOptionPane.showMessageDialog(null, "Pedido Excluido com Sucesso!");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
}
