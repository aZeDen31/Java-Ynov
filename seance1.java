///usr/bin/env jbang "$0" "$@" ; exit $?


import static java.lang.System.*;

public class seance1 {
    public static void main(String... args) {
        out.println("Hello World");

        // Typage explicite
        int i = 10;
        long j = 1_000_000;
     
        // "var" permet de faire du typage implicite
        var message = "hello";
        message = "world";

        // Il est impossible de changer un int en string et inversement. C'est du typage statique
        // L'opposé est le typage dynamique

        seance1.ShowSomeVariables();
    }

    public static void ShowSomeVariables(){
        byte b = 10; // de -127 à 128. 1 octet
        short s = 2; // de -32,768 à 32,767. 2 octets 
        int i = 10; // de -2^31 à (2^31)-1. 4 octets
        long l = 1_000_000; //de 2^63 à (2^63)-1. 8 octets

        String message = "J'aime Java";

        System.out.println(l);
        String text = String.format("b = %d, s = %d, i = %d, l = %d, message = %s",b,s,i,l,message);
        System.out.println(text);
    }
}
