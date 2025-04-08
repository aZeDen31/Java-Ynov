///usr/bin/env jbang "$0" "$@" ; exit $?

import java.util.ArrayList;

public class primeTable {

    public static void main(String... args) {
        int cnt = 0;
        boolean bool = true;
        ArrayList<Integer> nombres = new ArrayList<>();
        int i = 0;
        while(bool){
            if(isPrime.estPrime(i)){
                nombres.add(i);
                cnt++;
            }
            if(cnt == 10){
                bool = false;
            }
            i++;
        }
        System.out.println(nombres);
    }
}
