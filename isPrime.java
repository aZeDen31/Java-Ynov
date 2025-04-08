///usr/bin/env jbang "$0" "$@" ; exit $?

import java.util.Scanner;

public class isPrime {

    public static void main(String... args) {
        System.out.println(estPremier());
    }

    public static boolean estPrime(int nb){
        if(nb == 2){
            return true;
        } else if(nb == 0 || nb == 1){
            return false;
        } else {
            for(int i = 2 ; i <= nb/2+1 ; i++){
                if(nb%i == 0){
                    return false;
                }
            }
            return true;
        }
        
    }

    public static boolean estPremier(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir un nombre :");
        int nb = sc.nextInt();
        if(nb == 2){
            sc.close();
            return true;
        } else if(nb == 0 || nb == 1){
            sc.close();
            return false;
        } else {
            for(int i = 2 ; i <= nb/2+1 ; i++){
                if(nb%i == 0){
                    sc.close();
                    return false;
                }
            }
            sc.close();
            return true;
        }
        
    }
}
