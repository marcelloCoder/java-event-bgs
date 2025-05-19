package br.com.mcoder.entities;


public class Ingresso {
    private Long id;
    private String tipo;
    private Double preco;

    public Ingresso() {
    }

    public Ingresso(Long id, String tipo, Double preco) {
        this.id = id;
        this.tipo = tipo;
        this.preco = preco;
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

    @Override
    public String toString() {
        return "\nIngresso{" +
                "\nid=" + id +
                "\ntipo='" + tipo + '\'' +
                "\npreco=" + preco +
                '}';
    }
}
