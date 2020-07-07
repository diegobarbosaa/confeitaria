package dao;

import controller.LoginController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import model.ClientePJ;
import model.Login;

public class ClienteDao {
    
    
    public void cadastrarCliente(Cliente cliente){
        
        try(Connection con = new ConnectionDataBase().getConnection()){
            String sql = "INSERT INTO cliente (email, senha, cpf, nome, sobrenome, cep, cidade, rua,"
                    + "bairro, estado, numero, complemento) VALUE(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cliente.getEmail());
            stmt.setString(2, cliente.getSenha());
            stmt.setString(3, cliente.getCPF());
            stmt.setString(4, cliente.getNome());
            stmt.setString(5, cliente.getSobrenome());
            stmt.setString(6, cliente.getCep());
            stmt.setString(7, cliente.getCidade());
            stmt.setString(8, cliente.getRua());
            stmt.setString(9, cliente.getBairro());
            stmt.setString(10, cliente.getEstado());
            stmt.setInt(11, cliente.getNumero());
            stmt.setInt(12, cliente.getComplemento());
            
            stmt.execute();
            
            
            String sql1 = "SELECT cliente_id FROM cliente WHERE cpf = '"+cliente.getCPF()+"' ";
            stmt = con.prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                cliente.setCliente_id(rs.getInt("cliente_id"));
            }
               
            String sql2 = "INSERT INTO telefone_cliente (cliente_id, telefone_cliente_id) VALUES(?,?)";
            stmt = con.prepareStatement(sql2);
            stmt.setInt(1, cliente.getCliente_id());
            stmt.setInt(2, cliente.getTelefone());
            stmt.execute();
            
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro Feito com Sucesso!");
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
    public void cadastrarClientePJ(ClientePJ clientepj){
        
        try(Connection con = new ConnectionDataBase().getConnection()){
            String sql = "INSERT INTO cliente (email, senha, cnpj, nome_fantasia, razao_social, cep, cidade, rua,"
                    + "bairro, estado, numero, complemento) VALUE(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, clientepj.getEmail());
            stmt.setString(2, clientepj.getSenha());
            stmt.setString(3, clientepj.getCnpj());
            stmt.setString(4, clientepj.getNome_fantasia());
            stmt.setString(5, clientepj.getRazao_social());
            stmt.setString(6, clientepj.getCep());
            stmt.setString(7, clientepj.getCidade());
            stmt.setString(8, clientepj.getRua());
            stmt.setString(9, clientepj.getBairro());
            stmt.setString(10, clientepj.getEstado());
            stmt.setInt(11, clientepj.getNumero());
            stmt.setInt(12, clientepj.getComplemento());
            
            stmt.execute();
            
            
            String sql1 = "SELECT cliente_id FROM cliente WHERE cnpj = '"+clientepj.getCnpj()+"' ";
            stmt = con.prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                clientepj.setCliente_id(rs.getInt("cliente_id"));
            }
               
            String sql2 = "INSERT INTO telefone_cliente (cliente_id, telefone_cliente_id) VALUES(?,?)";
            stmt = con.prepareStatement(sql2);
            stmt.setInt(1, clientepj.getCliente_id());
            stmt.setInt(2, clientepj.getTelefone());
            stmt.execute();
            
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro Feito com Sucesso!");
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
    
    
    
    
    public void bucarUsuario(Cliente cliente){
        
        try(Connection conn = new ConnectionDataBase().getConnection()){
            
            
            String sql = "SELECT cliente_id, email, senha FROM cliente WHERE email = '"+cliente.getEmail()+"' and senha = '"+cliente.getSenha()+"' ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
           
            Cliente cliente1 = new Cliente();
           
             while(rs.next()){
                Login.setIdCliente(rs.getInt("cliente_id"));
                cliente1.setEmail(rs.getString("email"));
                cliente1.setSenha(rs.getString("senha"));
            }
            Login.setEmail(cliente1.getEmail());
            LoginController lc = new LoginController();
            lc.validarUser(cliente, cliente1);
            
       }catch(SQLException e){
            throw new RuntimeException (e);
       }
    }
    
 public void consultarProdutos(){
     
 }
    
/*public void buscarStatusCliente(Cliente cliente){
        
        try(Connection con = new ConnectionDataBase().getConnection()){
            String sql = "SELECT p.status_pedido, p.data_entrega, p.data_pedido, c.nome, c.nome_fantasia  "     
                    + "FROM cliente c, pedido p "
                    + "WHERE c.cliente_id = p.cliente_id "
                    + "AND cnpj = '"+cliente.getCPF()+"'";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            
                       
        }catch(SQLException e){
            throw new RuntimeException(e);
        }        
    }*/
    
    
}