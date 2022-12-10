import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SzenzorHalozat implements Iterable<Szenzor>{
    private List<Szenzor> szenzorok = new ArrayList<>();

    public void telepit(Szenzor sz){
        szenzorok.add(sz);
    }

    @Override
    public Iterator<Szenzor> iterator() {

        List<Szenzor> aktivak = new ArrayList<>();

        for(int i = szenzorok.size()-1; i>0;i--){
            if(szenzorok.get(i).isAktiv()){
                try {
                    aktivak.add((Szenzor) szenzorok.get(i).clone());
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        }

        return aktivak.iterator();
    }

    public List<Szenzor> aktivSzenzorok() throws CloneNotSupportedException {

        List<Szenzor> aktivak = new ArrayList<>();
        for (Szenzor sz:szenzorok
             ) {
            if (sz.isAktiv()){
                aktivak.add((Szenzor) sz.clone());
            }

        }
        return aktivak;
    }




}
