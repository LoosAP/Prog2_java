package egyetem;

public class Demonstrátor extends Oktató {
    private String szak;

    public String getSzak() {
        return szak;
    }

    public Demonstrátor(String dNév, String neptun, String dszak) {
        super(dNév,neptun,"Fiktív tanszék");
        szak = dszak;
    }
    public void setTanszék(String t){
        this.tanszék = t;
    }
}
