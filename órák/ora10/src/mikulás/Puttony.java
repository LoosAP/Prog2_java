package mikulás;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Puttony implements AjándékCsomag {
    private String címzett;
    private ArrayList<Ajándék> ajándékok;

    public Puttony(String címzett, Ajándék[] ajándéks) {
        this.címzett = címzett;
        this.ajándékok = new ArrayList<>();
        Collections.addAll(ajándékok,ajándéks);
        //this.ajándékok = new ArrayList<>(List.of(ajándéks));
    }

    @Override
    public int összérték() {
        int ossz = 0;
        for (Ajándék a : ajándékok){
            ossz += a.ár;
        }
        return ossz;
    }

    @Override
    public int nehezekSzáma(double t) {
        int nehezek = 0;
        for (Ajándék a : ajándékok){
            if (t < a.tömeg){
                nehezek ++;
            }
        }
        return nehezek;
    }

    @Override
    public Collection<GyerekJáték> gyerekjátékok() {
        ArrayList<GyerekJáték> játéks = new ArrayList<>();
        for (Ajándék a : ajándékok){
            if (!játéks.contains(a) && a.getClass().equals(GyerekJáték.class)){
                játéks.add((GyerekJáték) a);
            }
        }
        return játéks;
    }

    @Override
    public String toString() {
        StringBuilder ajándékString = new StringBuilder();

        for (Ajándék a : ajándékok){
            ajándékString.append(a.toString()).append("\n");
        }
        return címzett + "\n" + ajándékString;
    }
}
