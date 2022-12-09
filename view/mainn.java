package view;

import java.io.File;
import java.util.ArrayList;
import controller.*;

public class mainn {

  
  public static void main(String[] args) {
   
    String urlUSER = "C:\\Users\\leand\\Downloads\\dados_users.csv"; // caminho do arquivo
    String urlOBJ = "C:\\Users\\leand\\Downloads\\dados_objetos.csv"; // caminho do arquivo


    ManipularTxt manipulador = new ManipularTxt();
    Recomendacao recomendacao = new Recomendacao();


		File arquivo_user = new File(urlUSER);
		ArrayList<String> conteudo_user = manipulador.lerArquivo(arquivo_user);

    File arquivo_obj = new File(urlOBJ);
		ArrayList<String> conteudo_obj = manipulador.lerArquivo(arquivo_obj);



    //Leitura e inserção dos dados nas listas

      for (String string : conteudo_user) {

        String[] palavra = string.split(",");
        recomendacao.criarUser(palavra[0], palavra[1], palavra[2], palavra[3]);
      }

      for (String string : conteudo_obj) {
        String[] palavra = string.split(",");
        recomendacao.criarOBJ(palavra[0], palavra[1], palavra[2]);
      }


      Recomendacao.recomenda();
      Recomendacao.PrintRecomendacoes();

  }
}
