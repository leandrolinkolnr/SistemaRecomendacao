package controller;

import java.util.ArrayList;
import java.util.Collections;

import model.Objeto;
import model.User;

public class Recomendacao {

    static ArrayList<User> listaUsers = new ArrayList<>();
    static ArrayList<Objeto> listaObjs = new ArrayList<>();

    
    public static void recomenda(){

        for (User user : listaUsers) {
          for (Objeto objeto : listaObjs) {
    
                if (objeto.getArea().equalsIgnoreCase(user.getPreferencia1()) & objeto.getFormato().equalsIgnoreCase(user.getFormatoPreferido()) & 
                user.getRecomendacoes().size() < 4) {
                                                        user.adicionaRecomendacao(objeto);}
          }
    
        }  recomenda2();
      }
    
    

      private static void recomenda2(){
    
        for (User user : listaUsers) {
          
          for (Objeto objeto : listaObjs) {
                if (objeto.getArea().equalsIgnoreCase(user.getPreferencia1()) & user.getRecomendacoes().size() < 4 & ! user.getRecomendacoes().contains(objeto) ) {
                user.adicionaRecomendacao(objeto);}
                
          }
        }  recomenda3();
      }
    
    


      private static void recomenda3(){
    
        for (User user : listaUsers) {
          for (Objeto objeto : listaObjs) {
    
                if (objeto.getArea().equalsIgnoreCase(user.getPreferencia2()) & ! user.getRecomendacoes().contains(objeto) ){ user.adicionaRecomendacao(objeto);
                  break;}
          }
    
        } recomenda4();
      }

    

    
      private static void recomenda4(){
    
        for (User user : listaUsers) {
    
          Collections.shuffle(listaObjs);
          
          for (Objeto objeto : listaObjs) {
                if ( ! user.getRecomendacoes().contains(objeto)){ user.adicionaRecomendacao(objeto);
                  break;}
        }  
      }
    }



    public void criarUser(String nome, String preferencia1, String preferencia2, String formato) {
      User user = new User(nome, preferencia1, preferencia2, formato);
      listaUsers.add(user);
    }



  public void criarOBJ(String nome, String area, String formato) {
      Objeto obj = new Objeto(nome, area, formato);
      listaObjs.add(obj);
  }



      public static void PrintRecomendacoes(){
        for (User user: listaUsers) {
            user.listaRecomendacoes();
          }
      }
}
