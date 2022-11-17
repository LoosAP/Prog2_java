package egyetem;

public class Oktató implements Comparable<Oktató>{
    protected String név, neptunKód, tanszék;

    public Oktató(String név, String neptunKód, String tanszék) {
        this.név = név;
        this.neptunKód = neptunKód;
        this.tanszék = tanszék;
    }

    public String getNév() {
        return név;
    }

    public String getNeptunKód() {
        return neptunKód;
    }

    public String getTanszék() {
        return tanszék;
    }

    @Override
    public String toString(){
        return név + " (" + neptunKód + ") " + tanszék;
    }

    @Override
    public boolean equals(Object object) {
        Oktató oktató = (Oktató) object;
        return Object.equals(oktató.neptunKód);
    }

    @Override
    public int compareTo (Oktató o) {
        return név.compareTo(o.getNév());
    }

}
