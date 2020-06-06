package confeitaria.model;

public class ClientePF extends Cliente {

    private String cpf;

    private String nome;

    private String sobrenome;

    public ClientePF(String email, String rua, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        super(email, rua, numero, complemento, bairro, cidade, estado, cep);
    }


        
}