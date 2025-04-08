///usr/bin/env jbang "$0" "$@" ; exit $?

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class schtroumpf {

    public static void main(String... args) {
        int res = 0;
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        ArrayList<Integer> nombres1 = new ArrayList<>();
        ArrayList<Integer> nombres2 = new ArrayList<>();
        int nb = 0;
        int lng1 = randomGenerator.nextInt(2,5);
        int lng2 = randomGenerator.nextInt(2,5);

        for(int i = 1 ; i <= lng1 ; i++){
            nb = randomGenerator.nextInt(-10,11); 
            nombres1.add(nb);
        }

        for(int i = 1 ; i <= lng2 ; i++){
            nb = randomGenerator.nextInt(-10,11); 
            nombres2.add(nb);
        }
        System.out.println(nombres1);
        System.out.println(nombres2);

        for(int i = 0 ; i < lng1 ; i++){
            for(int j = 0 ; j < lng2 ; j++){
                res += nombres1.get(i)*nombres2.get(j);
            }
        }
        System.out.println(res);
    }
}
