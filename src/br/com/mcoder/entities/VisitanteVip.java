package br.com.mcoder.entities;

import java.util.List;

public class VisitanteVip extends Visitante{
    private boolean salaVipAcesso;
    private List<String> beneficios;

    public VisitanteVip(){

    }

    public VisitanteVip(Long id, String nome, String email, String cpf, Ingresso ingresso, Integer idade, String profissao, boolean salaVipAcesso, List<String> beneficios) {
        super(id, nome, email, cpf, ingresso, idade, profissao);
        this.salaVipAcesso = salaVipAcesso;
        this.beneficios = beneficios;
    }

    public boolean isSalaVipAcesso() {
        return salaVipAcesso;
    }

    public void setSalaVipAcesso(boolean salaVipAcesso) {
        this.salaVipAcesso = salaVipAcesso;
    }

    public List<String> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<String> beneficios) {
        this.beneficios = beneficios;
    }
}
