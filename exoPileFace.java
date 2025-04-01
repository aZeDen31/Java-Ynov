///usr/bin/env jbang "$0" "$@" ; exit $?
import java.util.random.RandomGenerator;
import java.util.Scanner;

public class exoPileFace {
    public static void main(String[] args){
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        int pileface = randomGenerator.nextInt(1,3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir pile ou face :");
        String str = sc.nextLine();
        
        if(str.equals("pile") && pileface == 1){
            sc.close();
            System.out.println("Gagné !");;
        } else if (str.equals("face") && pileface == 2) {
            sc.close();
            System.out.println("Gagné !");
        } else {
            sc.close();
            System.out.println("Perdu !");
        }
    }
}
