///usr/bin/env jbang "$0" "$@" ; exit $?

public class exoAdditionNombre {

    public static void main(String... args) {
        System.out.println(addChiffres(1234));
    }

    public static int addChiffres(int nb){
        String inter = "";
        String str = Integer.toString(nb);
        int res = 0;

        for(int i = 0 ; i < str.length() ; i++){
            inter = String.valueOf(str.charAt(i));
            res += Integer.parseInt(inter);
        }
        return res;
    }
}
