///usr/bin/env jbang "$0" "$@" ; exit $?


import static java.lang.System.*;
import java.util.random.RandomGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapExercice {

    public static void main(String... args) {
        //out.println(generation());
        //out.println(countWords("Le feu ça brûle et ça fait mal et l'eau ça mouille mais ça moins mal que le feu"));
        out.println(countA(List.of("I", "love", "Java", "and", "the", "JVM", "which", "is", "the", "Java", "Virtual", "Machine")));
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

    public static Map<String, Integer> countWords(String str){
        String[] list = str.split(" ");
        List<String> liste = new ArrayList<>(Arrays.asList(list));
        Map<String, Integer> map = new HashMap<>();
        String i = "";

        while(!liste.isEmpty()){
            i = liste.get(0);
            map.put(i, map.getOrDefault(i, 0) + 1);
            liste.remove(0);
        }

        return map;
    }

    public static Integer countA(List<String> words){
        Map<String, Integer> map = new HashMap<>();
        int cnt = 0;
        int cntInter = 0;
        for(String i : words){
            if(map.containsKey(i)){
                cnt += map.get(i);
            } else {
                for(int j = 0; j < i.length(); j++){
                    if(i.charAt(j) == 'a' || i.charAt(j) == 'A'){
                        cntInter++;
                    }
                    
                }
                map.put(i, cntInter);
                cnt += cntInter;
                cntInter = 0;
            }
        }
        
        System.out.println(map);
        return cnt;
    }
}
