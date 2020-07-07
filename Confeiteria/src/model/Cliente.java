package model;

public class Cliente {

    private Integer cliente_id;  private String email;

    private String rua;     private Integer numero;

    private Integer complemento;    private String bairro;

    private String cidade;     private String estado;

    private String cep;     private String senha; 
    
    private String CPF;     private String nome;
    
    private String sobrenome; Integer telefone; 

    public Cliente(String email, String rua, Integer numero, Integer complemento, String bairro, String cidade, String estado, String cep, String senha, Integer telefone) {
        
        this.email = email;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.senha = senha;
        this.telefone = telefone;
    }
    
    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    } 

    public Cliente(String email, String rua, Integer numero, Integer complemento, String bairro, String cidade, String estado, String cep, String senha, String nome, String sobrenome, String CPF, Integer Telefone) {
        this.email = email;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.senha = senha;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.telefone = Telefone;
    }   

    public String getSenha() {
        return senha;
    }
    
    public Cliente(){}

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Cliente(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    
    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}