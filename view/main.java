package main;

import java.io.File;
import java.util.ArrayList;

import model.User.*;
import model.Objeto;

import controller.ManipularTxt;


public class main {
    
  static ArrayList<User> listaUsers = new ArrayList<>();
  static ArrayList<Objeto> listaObjs = new ArrayList<>();
  

  public static void main(String[] args) {
   
    String urlUSER = "C:\\Users\\leand\\Downloads\\dados_users.csv"; // caminho do arquivo
    String urlOBJ = "C:\\Users\\leand\\Downloads\\dados_objetos.csv"; // caminho do arquivo


    ManipularTxt manipulador = new ManipularTxt();

		File arquivo_user = new File(urlUSER);
		ArrayList<String> conteudo_user = manipulador.lerArquivo(arquivo_user);

    File arquivo_obj = new File(urlOBJ);
		ArrayList<String> conteudo_obj = manipulador.lerArquivo(arquivo_obj);


    //Leitura e inserção dos dados nas listas

      for (String string : conteudo_user) {
        String[] palavra = string.split(",");
        criarUser(palavra[0], palavra[1], palavra[2], palavra[3], palavra[4]);
      }

      for (String string : conteudo_obj) {
        String[] palavra = string.split(",");
        criarOBJ(palavra[0], palavra[1], palavra[2]);
      }

      recomenda();

      for (User user: listaUsers) {
        user.listaRecomendacoes();
      } 
}


  private static void criarOBJ(String nome, String area, String formato) {
    Objeto obj = new Objeto(nome, area, formato);
    listaObjs.add(obj);
    
  }

  private static void criarUser(String nome, String id, String preferencia1, String preferencia2, String formato) {
    User user = new User(nome, id, preferencia1, preferencia2, formato);
    listaUsers.add(user);
  }


  private static void recomenda(){

    for (User user : listaUsers) {
      
      for (Objeto objeto : listaObjs) {

            if (objeto.getArea().equalsIgnoreCase(user.getPreferencia1()) & objeto.getFormato().equalsIgnoreCase(user.getFormatoPreferido()) & 
            user.getRecomendacoes().size() < 4) {
                                                 user.adicionaRecomendacao(objeto);}
      }

      for (Objeto objeto : listaObjs) {
            if (objeto.getArea().equalsIgnoreCase(user.getPreferencia1()) & user.getRecomendacoes().size() < 4 & ! user.getRecomendacoes().contains(objeto) ) {
            user.adicionaRecomendacao(objeto);}
            
      }
    }
  }
}
