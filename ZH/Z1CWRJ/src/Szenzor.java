public abstract class Szenzor {
    private Pozicio pozicio;

    public Pozicio getPozicio() {
        return pozicio;
    }

    protected void setPozicio(Pozicio pozicio) {
        this.pozicio = pozicio;
    }


    public Szenzor(Pozicio pozicio) {
        this.pozicio = pozicio;
    }

    public abstract Boolean isAktiv();
    public abstract void adatkuldes();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return String.format("%s (%d; %d)",
                isAktiv() ? "On" : "Off",
                pozicio.getX(), pozicio.getY());
    }
}
