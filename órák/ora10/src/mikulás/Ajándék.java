package mikulás;

import java.util.Objects;

public class Ajándék {
    protected String név;
    protected double tömeg;
    protected Integer ár;

    public Ajándék(String név, double tömeg, Integer ár) {
        this.név = név;
        this.tömeg = tömeg;
        this.ár = ár;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ajándék ajándék = (Ajándék) o;
        return Math.abs(ajándék.tömeg - ((Ajándék) o).tömeg) <= 1 && Objects.equals(név, ajándék.név);
    }

    @Override
    public String toString() {
        return név + " (" + Math.abs(tömeg) + " kg), " + ár + "Ft";
    }

    @Override
    public int compare(Ajándék o){
        int arCompare = o.ár.compareTo(ár);
        int nevCompare = név.compareTo(o.név);

        if (arCompare == 0){
            return nevCompare;
        }
        return arCompare;
}


