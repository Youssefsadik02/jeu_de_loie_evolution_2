package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier= new Scanner (System.in);
        Random generateur = new Random();
        System.out.println("Bienvenu dans notre jeu, Le but est de parcourir les 20 cases du jeu avec 5 lancers d'un dé. Un dé à 6 faces sera donc lancé 5 fois. ");
        clavier.nextLine();
        clavier.close();

       
        
        int nbrTeste=0;
        int depassement=0;
        int casecourante=0;
       
        
        while ( casecourante!=20){
             int lancer = generateur.nextInt(6) + 1;
             casecourante+=lancer;
               if (casecourante>20){
            
            depassement=casecourante-20;
            casecourante= 20-depassement;
            }
            System.out.println("vous avez fait "+ lancer+" , vous etes sur la case "+ casecourante);
            nbrTeste++;
         }
         System.out.println("Vous avez gagner");
         System.out.println("vous avez fait "+ nbrTeste +" de testes");   
            
        }
    }

    

   

    
    

