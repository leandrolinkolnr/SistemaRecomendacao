package main;


public class User {

    private String nome;
    private String id;
    private String preferencia1;
    private String preferencia2;
    private String formatoPreferido;

     User(String nome, String id, String preferencia1, String preferencia2, String formatoPreferido) {
        this.nome = nome;
        this.id = id;
        this.preferencia1 = preferencia1;
        this.preferencia2 = preferencia2;
        this.formatoPreferido = formatoPreferido;
    }

    public String getNome() {
        return nome;
    }
}
