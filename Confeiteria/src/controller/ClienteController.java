package controller;

import dao.ClienteDao;
import model.Cliente;
import model.ClientePJ;

public class ClienteController {
    
    public void cadastrarCliente (Cliente cliente) {
        
        dao.ClienteDao dao = new ClienteDao();
        dao.cadastrarCliente(cliente);
       
    }
    
    public  void casdastrarClientePJ (ClientePJ clientepj) {
        dao.ClienteDao dao = new ClienteDao();
        dao.cadastrarClientePJ(clientepj);
    }
}
