package controller;

import dao.ClienteDao;
import javax.swing.JOptionPane;
import model.Cliente;
import view.Pedido;

public class LoginController {
    
    public void validarLogin(Cliente cliente){
        
        ClienteDao dao = new ClienteDao();
        dao.bucarUsuario(cliente);        
    }
    
    public void validarUser(Cliente cliente, Cliente cliente1){
        
        if(cliente.getEmail().equals(cliente1.getEmail()) && cliente.getSenha().equals(cliente1.getSenha())){
            
            new Pedido().setVisible(true);
            JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            
            
        } else{
            JOptionPane.showMessageDialog(null, "Usuario e senha incorreto!");
        }
        
    }   
}
