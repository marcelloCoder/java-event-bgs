package br.com.mcoder.entities;

public class Organizador extends Pessoa{
    private String setorResponsavel;
    private String nivelAcesso;

    public Organizador(Long id, String nome, String email, String cpf, Ingresso ingresso, String setorResponsavel, String nivelAcesso) {
        super(id, nome, email, cpf, ingresso);
        this.setorResponsavel = setorResponsavel;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }


    @Override
    public String toString() {
        return "\nOrganizador{" +
                "\nsetorResponsavel='" + setorResponsavel + '\'' +
                "\nnivelAcesso='" + nivelAcesso + '\'' +
                "} " + super.toString();
    }
}
