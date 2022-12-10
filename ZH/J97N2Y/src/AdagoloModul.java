import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdagoloModul implements Iterable<Adagolo>{
    private List<Adagolo> adagolok = new ArrayList<>();


    public void telepit(Adagolo sz){
        adagolok.add(sz);
    }

    @Override
    public Iterator<Adagolo> iterator() {

        List<Adagolo> aktivak = new ArrayList<>();

        for(int i = adagolok.size()-1; i>0;i--){
            if(adagolok.get(i).isAktiv()){
                try {
                    aktivak.add((Adagolo) adagolok.get(i).clone());
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        }

        return aktivak.iterator();
    }

    public List<Adagolo> aktivAdagolok() throws CloneNotSupportedException {

        List<Adagolo> aktivad = new ArrayList<>();
        for (Adagolo a:adagolok
        ) {
            if (a.isAktiv()){
                aktivad.add((Adagolo) a.clone());
            }

        }
        return aktivad;
    }

}
