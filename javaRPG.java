///usr/bin/env jbang "$0" "$@" ; exit $?

import static java.lang.System.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class javaRPG {

    public static void main(String... args){
        boolean continuer = true; 
        
        Scanner scanner = new Scanner(System.in);
        while(continuer){
            
            System.out.print("Entrez votre nom : ");
            String nom = scanner.nextLine();
            
            System.out.print("Entrez votre classe : ");
            String classe = scanner.nextLine();

            System.out.print("Voulez vous ajouter un autre personnage ? [y/n] ");
            String cont = scanner.nextLine();

            

            if(cont == "n"){
                continuer = false;
            }
        }
    }
}
