package harcosesvarazslo;

public class Gyakorlo {

    public static void main(String[] args) {

        String eredeti = "abc.12x";
        int hossz = eredeti.length();
        char elso = eredeti.charAt(0);
        char utolso = eredeti.charAt(hossz - 1);
        System.out.println(elso);
        System.out.println(utolso);
        String uj = eredeti.substring(3, 6);
        System.out.println(uj);
    }
}
