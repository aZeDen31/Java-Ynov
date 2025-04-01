///usr/bin/env jbang "$0" "$@" ; exit $?


import java.util.random.RandomGenerator;
import java.util.Scanner;

public class exoDevineNombre {

    public static void main(String... args) {
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        int rnd = randomGenerator.nextInt(1,21);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir un nombre :");
        int nombre = sc.nextInt();
        boolean bool = true;

        while(bool){
            if(nombre == rnd){
                System.out.println("Bravo, tu as gagné ! Le nombre mystère était : "+rnd);
                bool = false;
                sc.close();
            } else if (nombre < rnd){
                System.out.println("Ton nombre est inférieur au nombre mystère !");
                nombre = sc.nextInt();
            } else {
                System.out.println("Ton nombre est supérieur au nombre mystère !");
                nombre = sc.nextInt();
            }
        }
    }
}
