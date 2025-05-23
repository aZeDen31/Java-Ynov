///usr/bin/env jbang "$0" "$@" ; exit $?


import static java.lang.System.*;
import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class spaceShooter {

    public static void main(String... args) {

        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        List<List<Character>> niveau = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<Character> ligne = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                ligne.add('.');
            }
            niveau.add(ligne);
        }
        
        int cnt = 0;
        int nbEnnemi = randomGenerator.nextInt(0,8);
        while(cnt < nbEnnemi){
            int rnd1 = randomGenerator.nextInt(0,8);
            int rnd2 = randomGenerator.nextInt(0,9);

            if(niveau.get(rnd1).get(rnd2) == '.'){
                niveau.get(rnd1).set(rnd2, 'E');
                cnt++;
            }
        }
        int ligne = 8;
        int rnd = randomGenerator.nextInt(4,6);
        niveau.get(9).set(rnd, 'V');
        while(ligne >= 0){
            if(niveau.get(ligne).get(rnd) == '.'){
                ligne--;
                niveau.get(ligne).set(rnd, 'V');
                niveau.get(ligne+1).set(rnd, '.');
            } else {
                rnd++;
                niveau.get(ligne-1).set(rnd, 'V');
                niveau.get(ligne+1).set(rnd, '.');
            }
    
    
            for (int i = 0; i < 10; i++) {
                out.println(niveau.get(i) + "\n");
            }
            out.println("\n ----------------------------------------------------");
        }
        out.println("Vous avez gagné !");
    }
}

