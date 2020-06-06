/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria.controller;

import confeitaria.model.Cliente;

/**
 *
 * @author Max
 */
public class ClienteController {
    
    public boolean cadastrarCliente (String email, String rua, 
    String numero, String complemento, String bairro, String cidade, 
    String estado, String cep) {
        
        if (email != null && email.length() > 0 && rua != null && rua.length() > 0 && numero != null && numero.length() > 0 &&
            complemento != null && complemento.length() > 0 && bairro != null && bairro.length() > 0 && cidade != null && cidade.length() > 0 &&
            estado != null && estado.length() > 0 && cep != null && cep.length() > 0) {
        
            Cliente cliente = new Cliente (email, rua, numero, complemento, bairro, cidade, estado, cep);
            cliente.cadastrarCliente();
            return true;     
        }
        else {
            return false;
        }
    }
}
