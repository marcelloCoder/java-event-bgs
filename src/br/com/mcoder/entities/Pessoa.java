package br.com.mcoder.entities;


public abstract class Pessoa {
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private Ingresso ingresso;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String email, String cpf, Ingresso ingresso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.ingresso = ingresso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nPessoa{" +
                "\nid=" + id +
                "\nnome='" + nome + '\'' +
                "\nemail='" + email + '\'' +
                "\ncpf='" + cpf + '\'' +
                "\ningresso=" + ingresso +
                '}';
    }
}
