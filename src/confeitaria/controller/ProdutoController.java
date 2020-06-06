/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria.controller;

import confeitaria.model.Produto;

/**
 *
 * @author Max
 */
public class ProdutoController {
    
    public boolean cadastrarProduto (String produto_nome, String produto_descricao, Float preco_unitario, String tamanho, String nome_categoria) {
        
        if (produto_nome != null && produto_nome.length() > 0 && produto_descricao != null && produto_descricao.length() > 0 && preco_unitario != null && preco_unitario > 0 &&
            tamanho != null && tamanho.length() > 0) {  
            
            Produto produto = new Produto (produto_nome, produto_descricao, preco_unitario, tamanho);
            produto.categoria.setCategoria_nome(nome_categoria);
            
            
            
            
            
            produto.cadastrarProduto();
            
            
            return true;     
        }
        else {
            return false;
        }
    }
    
}