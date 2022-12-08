package model;

import java.util.ArrayList;

public class User {

    private String nome;
    private String id;
    private String preferencia1;
    private String preferencia2;
    private String formatoPreferido;
    
    private ArrayList<Objeto> recomendacoes = new ArrayList<>();

   public User(String nome, String id, String preferencia1, String preferencia2, String formatoPreferido) {
        this.nome = nome;
        this.id = id;
        this.preferencia1 = preferencia1;
        this.preferencia2 = preferencia2;
        this.formatoPreferido = formatoPreferido;
    }

    public String getNome() {
        return nome;
    }

    public String getPreferencia1() {
        return preferencia1;
    }

    public String getPreferencia2() {
        return preferencia2;
    }

    public String getFormatoPreferido() {
        return formatoPreferido;
    }

    public void adicionaRecomendacao(Objeto obj){
        recomendacoes.add(obj);
    }

    public int getSizeRecomendacoes() {
        return recomendacoes.size();
    }

    public ArrayList<Objeto> getRecomendacoes() {
        return recomendacoes;
    }

    public void listaRecomendacoes(){
        System.out.println("Recomendacoes para o usuario " + nome + ": " + preferencia1 + " - " + preferencia2);
        for (Objeto objeto : recomendacoes) {
            System.out.println(objeto.getNome());
        }
        System.out.println(" ");
    }

}
