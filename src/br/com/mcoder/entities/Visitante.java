package br.com.mcoder.entities;

public class Visitante extends Pessoa{
    private Integer idade;
    private String profissao;

    public Visitante(){

    }

    public Visitante(Long id, String nome, String email, String cpf, Ingresso ingresso, Integer idade, String profissao) {
        super(id, nome, email, cpf, ingresso);
        this.idade = idade;
        this.profissao = profissao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Visitante{");
        sb.append("idade=").append(idade);
        sb.append(", profissao='").append(profissao).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
