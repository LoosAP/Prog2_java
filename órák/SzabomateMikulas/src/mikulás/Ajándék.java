package mikulás;

import java.util.Objects;

public class Ajándék implements Comparable<Ajándék>{

    protected String név;
    protected Double tömeg;
    protected Integer ár;

    public Ajándék(String név, Double tömeg, Integer ár) {
        this.név = név;
        this.tömeg = tömeg;
        this.ár = ár;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ajándék ajándék = (Ajándék) o;
        return név.equals(ajándék.név) && (Math.abs(tömeg - ajándék.tömeg)<=1);
    }

    @Override
    public String toString() {
        return név+" ("+tömeg+" kg), "+ár+" Ft";
    }

    @Override
    public int compareTo(Ajándék o) {
        int arCompare = o.ár.compareTo(ár);
        int nevCompare = név.compareTo(o.név);

        if(arCompare == 0){
            return nevCompare;
        }
        return arCompare;
    }
}
