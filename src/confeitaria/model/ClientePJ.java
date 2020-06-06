package confeitaria.model;

public class ClientePJ extends Cliente {

    private String cnpj;

    private String nome_fantasia;

    private String razao_social;

    public ClientePJ(String email, String rua, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        super(email, rua, numero, complemento, bairro, cidade, estado, cep);
    }

  

        
}