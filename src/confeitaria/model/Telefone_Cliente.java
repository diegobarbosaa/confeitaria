package confeitaria.model;

public class Telefone_Cliente extends Cliente {

    private Integer telefone_cliente_id;

    public Telefone_Cliente(String email, String rua, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        super(email, rua, numero, complemento, bairro, cidade, estado, cep);
    }

       
    
}