package ora4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Auto kocsi = new Auto("Opel","Corsa",100);
        Auto kocsi2 = new Auto("Suzuki",80);
        Auto kocsi3 = new Auto();
        Auto kocsi4 = new Auto("Opel","Corsa",100);
        Auto kocsi5 = new Auto("Opel","Astra",100);

        kocsi2.setLoero(80);
        System.out.println(kocsi.getTipus());
        System.out.println(kocsi2.getTipus());
        System.out.println(kocsi3.getMarka());
        System.out.println(Auto.getCount());
        System.out.println(kocsi.equals(kocsi4));

        List<Auto> autoslista = new ArrayList<>();
        autoslista.add(kocsi);
        autoslista.add(kocsi2);
        autoslista.add(kocsi3);
        autoslista.add(kocsi4);
        autoslista.add(kocsi5);
        System.out.println(autoslista);
        //megoldas1 loero szerint
        Collections.sort(autoslista);
        System.out.println(autoslista);

        //megoldas2 loero->marka->tipus szerint


        List<Auto> loerosorted = autoslista.stream().sorted((f,s) -> {
            return f.getLoero().compareTo(s.getLoero());
        }).collect(Collectors.toList());
        List<Auto> nevsorted = autoslista.stream().sorted((f,s) -> {
            return f.getMarka().compareTo(s.getMarka());
        }).collect(Collectors.toList());
        List<Auto> tipussorted = autoslista.stream().sorted((f,s) -> {
            return f.getTipus().compareTo(s.getTipus());
        }).collect(Collectors.toList());

        System.out.println(tipussorted);

        Comparator<Auto>  autoComparator= new AutoComparator();

    }
}
