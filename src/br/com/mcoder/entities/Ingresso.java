package br.com.mcoder.entities;


public class Ingresso {
    private Long id;
    private String tipo;
    private Double preco;
    private Evento evento;

    public Ingresso() {
    }

    public Ingresso(Long id, String tipo, Double preco, Evento evento) {
        this.id = id;
        this.tipo = tipo;
        this.preco = preco;
        this.evento = evento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ingresso{");
        sb.append("id=").append(id);
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", evento=").append(evento);
        sb.append('}');
        return sb.toString();
    }

}
