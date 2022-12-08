package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class ManipularTxt {

    public ManipularTxt() {
    }

public ArrayList<String> lerArquivo(File file) {
    FileReader ler;
    
    ArrayList<String> linhas = new ArrayList<>();

   try {
       ler = new FileReader(file);
       
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf8"));

           String linha;

           try {
               while( (linha = reader.readLine()) != null ){
                   linhas.add(linha);
               }
               reader.close();
               return linhas;

           } catch (IOException e) {
               
               System.out.println("Erro na leitura do arquivo: " + e.getMessage());
               e.printStackTrace();
               return null;
           }
   } catch (FileNotFoundException | UnsupportedEncodingException e) {
       
       e.printStackTrace();
       System.out.println("Erro na leitura do arquivo: " + e.getMessage());

       return null;
   }

}
}