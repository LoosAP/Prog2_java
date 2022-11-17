package beugró;

import java.util.ArrayList;
import java.util.Collection;

public class beugro2 {
    public static Oktató[] InformatikaTanár (Collection<Oktató> coll){
        ArrayList<Oktató> informatikaTanárok = new ArrayList<>();
        for (Oktató o: coll){
            if (o.getClass().equals(Demonstrátor.class)){
                Demonstrátor d = Demonstrátor o;
                if (d.getSzak().equals("informatikatanár")){
                    informatikaTanárok.add(o);
                }
            }
        }
        Oktató[] infoTanárok = new Oktató[iformatikaTanárok.size()];
        return informatikaTanárok.toArray(infoTanárok);
        return null;
    }
    public static void main(String[] args){
        for(Oktató o : informatikaTanár(halmaz)) {
            System.out.print(o);
        }
    }
}
