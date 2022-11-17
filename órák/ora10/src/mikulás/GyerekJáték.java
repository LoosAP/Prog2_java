package mikulás;

public class GyerekJáték extends Ajándék {
    private Integer korhatár;

    public GyerekJáték(String név, double tömeg, Integer ár, Integer korhatár) {
        super(név, tömeg, ár);
        this.korhatár = korhatár;
    }

    public int getKorhatár() {
        return korhatár;
    }

    @Override
    public String toString() {
        return név + " (" + Math.abs(tömeg) + " kg), " + ár + "Ft," + korhatár + " éves kortól";
    }
}
