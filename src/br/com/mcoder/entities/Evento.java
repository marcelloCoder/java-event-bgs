package br.com.mcoder.entities;

import java.time.LocalDate;

public class Evento {
    private Long id;
    private String nome;
    private String endereco;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Evento(){}

    public Evento(Long id, String nome,String endereco, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Evento{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", endereco='").append(endereco).append('\'');
        sb.append(", dataInicio=").append(dataInicio);
        sb.append(", dataFim=").append(dataFim);
        sb.append('}');
        return sb.toString();
    }
}
