
package Jogos;

import java.util.Random;
import java.util.Scanner;



public class acerte_o_numero {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Random gerador = new Random();
        
        //Tela de inicio, regras
        System.out.println("\n\n\n---Seja bem vindo---");
        System.out.println("Neste jogo voce tera que adivinhaar o numero que o"
                + " Joao esta pesando.\n\n");
        System.out.println("VOCE TERA 5 CHANCES PARA ACERTAR O NUMERO\n\n");
        
   
        
        //Escolha um numero
        int nujoao, nuplayer, vida=5;
        System.out.println("Joao esta pesando em um numero...");
        nujoao= gerador.nextInt(10);
        
        //inicio laço
 do{    System.out.println("_______________________________________________________________________________________________________________________________________________");
        System.out.println("\ndica: o numero e entre 0 a 10");
        System.out.println("Voce tem: "+ vida+ " vidas\n\n");
        System.out.println("Qual numero Joao esta pesando ?");
        nuplayer=input.nextInt();
        
        //Caso acerte
         if(nuplayer==nujoao && vida>0){
            System.out.println("Parabens, voce acertou o numero que Joao pensou!!");
        //Caso erre e tenha vida    
        }else if(nuplayer!=nujoao && vida>=0){
            System.out.println("Voce errou o numero, tente novamente");
            vida=vida-1;}
        }while(vida>0 && nuplayer!=nujoao); //retorna
        //Caso acabe as vidas 
        if(vida==0){  
            System.out.println("Mas voce perdeu todas as vidas\n");
            System.out.println("Joao estava pensando no "+ nujoao);
            System.out.println("\n\n---GAMER OVER---");
           
        }
    }
        
} 
       
    
            
       
