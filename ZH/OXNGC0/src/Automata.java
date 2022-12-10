import org.example.Pozicio;

public abstract class Automata {
    private org.example.Pozicio pozicio;

    public org.example.Pozicio getPozicio() {
        return pozicio;
    }

    protected void setPozicio(Pozicio pozicio) {
        this.pozicio = pozicio;
    }

    public Automata(Pozicio pozicio) {
        this.pozicio = pozicio;
    }

    public abstract boolean isAktiv();

    public abstract void adatkuldes();

    @Override
    protected abstract Object clone() throws CloneNotSupportedException;

    @Override
    public String toString() {
        return String.format("%s (%d; %d)",
                isAktiv() ? "On" : "Off",
                pozicio.getX(), pozicio.getY());
    }

}
