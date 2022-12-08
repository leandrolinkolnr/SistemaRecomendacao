package model;

public class Objeto {

    private String nome;
    private String area;
    private String formato;


    public Objeto(String nome, String area, String formato) {
        this.nome = nome;
        this.area = area;
        this.formato = formato;
    }

    public String getNome() {
        return nome;
    }

    public String getArea() {
        return area;
    }

    public String getFormato() {
        return formato;
    }
}
