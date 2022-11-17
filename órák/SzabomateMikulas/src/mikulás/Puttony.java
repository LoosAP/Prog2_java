package mikulás;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Puttony implements AjándékCsomag{
    private String címzett;
    private ArrayList<Ajándék> ajándékok;

    public Puttony(String címzett, Ajándék[] ajándéks) {
        this.címzett = címzett;
        this.ajándékok = new ArrayList<>();
        Collections.addAll(ajándékok,ajándéks);

        //this.ajándékok = new ArrayList<>(List.of(ajándéks));
    }

    @Override
    public int összÉrték() {
        int ossz = 0;
        for (Ajándék a : ajándékok){
            ossz += a.ár;
        }
        return ossz;
    }

    @Override
    public int nehezekSzáma(double t) {
        int nehezek = 0;
        for(Ajándék a : ajándékok){
            if (a.tömeg > t){
                nehezek++;
            }
        }
        return nehezek;
    }

    @Override
    public Collection<GyerekJáték> gyerekjátékok() {
        ArrayList<GyerekJáték> játéks = new ArrayList<>();
        for (Ajándék a : ajándékok){
            if(!játéks.contains(a) && a.getClass().equals(GyerekJáték.class)){
                játéks.add((GyerekJáték) a);
            }
        }
        return játéks;
    }

    //HF
    /*Definiálja
    felül a toString() metódust úgy, hogy az az első sorban a puttony címzettjét
    , majd egy üres sort
    követően soronként az egyes ajándékokat adja vissza!*/
    @Override
    public String toString() {
        StringBuilder ajándékString = new StringBuilder();
        for(Ajándék a : ajándékok){
            ajándékString.append(a.toString()).append("\n");
        }
        return címzett+"\n"+ajándékString;
    }
    public Collection<GyerekJáték> játékkorhatár(Integer korhatár){
        if(korhatár <0){
            throw new IllegalArgumentException("Negatív életkor");
        }
        ArrayList<GyerekJáték> gyerekJátéks = new ArrayList<>();
        for (Ajándék a : ajándékok){
            if (a.getClass().equals(GyerekJáték.class) && ((GyerekJáték)a).getKorhatár() > korhatár){
                gyerekJátéks.add((GyerekJáték) a);
            }
        }
        return gyerekJátéks;
    }
}
