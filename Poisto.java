package fi.academy;

import java.util.ArrayList;
import java.util.List;

public class Poisto {
    private static List<String> paivat = new ArrayList<>();
    static {
        paivat.add("maanantai");
        paivat.add("tiistai");
        paivat.add("keskiviikko");
        paivat.add("torstai");
        paivat.add("testitai");
        paivat.add("lauantai");
        paivat.add("sunnuntai");
    }

    public static void main(String[] args) {
        System.out.println(paivat);
//        paivat.remove("tiistai");
//        paivat.remove("torstai");

//        // EI TOIMI! ConcurrentModificationException
//        for(String pv : paivat) {
//            if(pv.toLowerCase().startsWith("t")) {
//                paivat.remove(pv);
//            }
//        }

        for (int i = 0; i < paivat.size(); ) {
            if(paivat.get(i).toLowerCase().charAt(0)=='t') {
                paivat.remove(i);
            } else {
                ++i;
            }
        }

        System.out.println(paivat);
    }
}
