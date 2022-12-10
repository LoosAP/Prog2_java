public abstract class Adagolo {
    private org.example.Pozicio pozicio;

    public org.example.Pozicio getPozicio() {
        return pozicio;
    }

    protected void setPozicio(org.example.Pozicio pozicio) {
        this.pozicio = pozicio;
    }

    public Adagolo(org.example.Pozicio pozicio) {this.pozicio = pozicio;}

    public abstract boolean isAktiv();

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
