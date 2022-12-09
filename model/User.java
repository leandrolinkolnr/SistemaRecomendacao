package model;

import java.util.ArrayList;

public class User {

    private String nome;
    private String preferencia1;
    private String preferencia2;
    private String formatoPreferido;
    
    private ArrayList<Objeto> recomendacoes = new ArrayList<>();

   public User(String nome, String preferencia1, String preferencia2, String formatoPreferido) {
        this.nome = nome;
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
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Usuario " + nome + ": ");
        System.out.println("Preferencias: " + preferencia1 + " e " + preferencia2);
        System.out.println("Formato preferido: " + formatoPreferido);
        System.out.println();
        System.out.println("Recomendações:");

        for (Objeto objeto : recomendacoes) {
            System.out.println(objeto.getNome());
        }
        System.out.println(" ");
    }

}
