package harcosesvarazslo;

import java.util.Random;

public class HarcosEsVarazslo {

    static Random rnd = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            
            String palya = "";
            final int VHELY = rnd.nextInt(3);
            final int HHELY = rnd.nextInt(3);
            
            for (int helyIndex = 0; helyIndex < 3; helyIndex++) {
                if (VHELY == helyIndex && HHELY == helyIndex) {
                    palya += "X";
                } else if (VHELY == helyIndex && HHELY != helyIndex) {
                    palya += "V";
                } else if (VHELY != helyIndex && HHELY == helyIndex) {
                    palya += "H";
                } else if (VHELY != helyIndex && HHELY != helyIndex) {
                    palya += "_";
                }
            }
            System.out.println(palya);
        }
    }

}
