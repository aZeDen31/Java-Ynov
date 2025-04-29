///usr/bin/env jbang "$0" "$@" ; exit $?


import static java.lang.System.*;
import java.util.random.RandomGenerator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapExercice {

    public static void main(String... args) {
        out.println(generation());
    }

    public static String generation(){
        List<Integer> listeIntegers = new ArrayList<>();
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        int cnt = 0;
        int stock;
        int rnd = randomGenerator.nextInt(-2,3);
        stock = rnd;
        while(cnt < 2){
            if(rnd == stock){
                cnt++;
                listeIntegers.add(rnd);
            } else {
                cnt = 0;
                listeIntegers.add(rnd);
                stock = rnd;
            }
            rnd = randomGenerator.nextInt(-2,3);
        }
        return "Liste : " + listeIntegers + "\n Dico trié : " + compteur(listeIntegers);
    }

    public static Map<Integer, Integer> compteur(List<Integer> listIntegers){
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;

        while(!listIntegers.isEmpty()){
            i = listIntegers.get(0);
            map.put(i, map.getOrDefault(i, 0) + 1);
            listIntegers.remove(0);
        }

        return map; 
    }
}
