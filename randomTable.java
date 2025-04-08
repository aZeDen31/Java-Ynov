///usr/bin/env jbang "$0" "$@" ; exit $?
/// 
import java.util.ArrayList;

import java.util.random.RandomGenerator;

public class randomTable {

    public static void main(String... args) {
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        int nb = 0;
        ArrayList<Integer> nombres = new ArrayList<>();
        int moyenne = 0;
        int highest = 0;
        int lowers = 0;
        //int ecartType = 0;
        int pair = 0;
        int impair = 0;
        int positif = 0;
        int negatif = 0;

        for(int i = 0 ; i <= 10 ; i++){
            nb = randomGenerator.nextInt(-10,11); 
            nombres.add(nb);
        }
        System.out.println(nombres);

        for(int i = 0 ; i < 9 ; i++){
            if(nombres.get(i) > nombres.get(i+1)){
                highest = nombres.get(i);
            }
            if(nombres.get(i) < nombres.get(i+1)){
                lowers = nombres.get(i);
            }
        }

        for (int i = 0 ; i < 10 ; i++){
            moyenne += nombres.get(i);
            if(nombres.get(i)%2 == 0){
                pair++;
            } else {
                impair++;
            }
            if(nombres.get(i) < 0){
                negatif++;
            } else {
                positif++;
            }
        }
        moyenne = moyenne / 10;
        System.out.println("Moyenne : "+moyenne);
        System.out.println("Plus grand : "+highest);
        System.out.println("Plus petit : "+lowers);
        System.out.println("Positifs : "+positif);
        System.out.println("Négatif : "+negatif);
        System.out.println("Pairs : "+pair);
        System.out.println("Impairs : "+impair);
    }
}
