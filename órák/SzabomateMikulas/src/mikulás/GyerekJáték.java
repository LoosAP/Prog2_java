package mikulás;

public class GyerekJáték extends Ajándék{
    private Integer korhatár;

    public GyerekJáték(String név, Double tömeg, Integer ár, Integer korh) {
        super(név, tömeg, ár);
        korhatár=korh;
    }

    public Integer getKorhatár() {
        return korhatár;
    }

    @Override
    public String toString() {
        return név+" ("+tömeg+" kg), "+ár+" Ft, "+korhatár+" éves kortól.";
    }
}
