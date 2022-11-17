package egyetem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Egyetem implements Iskola{
    ArrayList<Oktató> oktatók;

    public Egyetem(Collection<Oktató> oktatók.coll){
        //itt valami kimaradt
        for (Oktató o : oktatók.coll){
            if (!oktatók.contains(o)){
                oktatók.add(o);
            }

        }
    }

    @Override
    public void felvesz(Oktató oktató){
        oktatók.add(oktató);
    }

    @Override
    public Collection<Oktató> oktatók() {
        return oktatók;
    }
    public void oktatókAbc() throws ÜresEgyetemException{
        Collections.sort(oktatók);
        if (oktatók.isEmpty()){
            throw new ÜresEgyetemException("Nincs oktató az egyetemen!");
        }
        else {
            for (Oktató o : oktatók){
                System.out.print(o.getNév() + " " + o.getTanszék());
            }
        }
    }

    public void demonstrátorTanszék(String tanszék){
        for (Oktató o : oktatók){
            if (o.getClass().equals(Demonstrátor.class)){
                Demonstrátor d = (Demonstrátor) o;
                d.setTanszék(tanszék);
                //((Demonstrátor)o).setTanszék(tanszék); egyenértékűek
            }
        }
    }

}
