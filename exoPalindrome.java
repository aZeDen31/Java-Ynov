///usr/bin/env jbang "$0" "$@" ; exit $?

public class exoPalindrome {

    public static void main(String... args) {
        System.out.println(retourneString("Bonjour !"));
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("Bonjour !"));
    }

    private static String retourneString(String  str){
        String res = "";
        for (int i = str.length()-1; i >= 0; i--){
            res += str.charAt(i);
        }
        return res;
    }

    private static String isPalindrome(String str){
        if(str.equals(exoPalindrome.retourneString(str))){
        return "Palindrome !";
        }
        return "Pas palindrome !";
    }
}
