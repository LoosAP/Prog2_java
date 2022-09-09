
public class Fruit {
    private int id;
    private String nev;
    private String szin;    

    public Fruit(){}

    public Fruit(int id, String nev, String szin){
        this.id = id;
        this.nev = nev;
        this.szin = szin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                ", szin='" + szin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode(id,nev,szin);
    }


}
