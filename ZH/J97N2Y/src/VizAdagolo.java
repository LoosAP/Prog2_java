import org.example.Pozicio;

import java.time.LocalDateTime;
import java.util.Locale;

public class VizAdagolo extends Adagolo implements IVizAdagolo{
    private int alsoHatar;
    private int felsoHatar;
    private boolean aktiv;

    public int getAlsoHatar() {return alsoHatar};

    private void setAlsoHatar(int alsoHatar) {
        try {

            if (alsoHatar > 100) {
                this.alsoHatar = alsoHatar;
            } else {
                Exception AlacsonyAlsoHatarException = new AlacsonyAlsoHatarException();
                throw AlacsonyAlsoHatarException;
            }
        } catch (AlacsonyAlsoHatarException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public int getFelsoHatar() {
        return felsoHatar;
    }

    private void setFelsoHatar(int felsoHatar) {
        this.felsoHatar = felsoHatar;
    }

    public Boolean getAktiv() {
        return aktiv;
    }

    public void setAktiv(Boolean aktiv) {
        this.aktiv = aktiv;
    }

    public VizAdagolo(int x, int y, int alsoHatar, int felsoHatar) {
        super(new Pozicio(x, y));
        hatarokatBeallit(alsoHatar, felsoHatar);
        this.aktiv = true;
    }
    @Override
    public Boolean isAktiv() {
        return aktiv;
    }

    @Override
    public void hatarokatBeallit(int alsoHatar, int felsoHatar) {
        setAlsoHatar(alsoHatar);
        setFelsoHatar(felsoHatar);
    }

    @Override
    public double vizetAdagol() {
        try {
            if(this.isAktiv()){
                double random = Math.random();
                random = random*(felsoHatar-alsoHatar)+alsoHatar;

                return Double.parseDouble(String.format(Locale.ENGLISH,"%.2f",random));


            }
        }catch (AdagoloInaktivException e){

        }
        return 0.0;
    }

    @Override
    public void adatkuldes() {
        LocalDateTime ido = LocalDateTime.now();

        double viz = this.vizetAdagol();

        StringBuilder sb = new StringBuilder();

        sb.append("Adagolt víz a(z) (").append(this.getPozicio().getX()).append(";").append(this.getPozicio().getY()).
                append(") pozición ").append(ido.getYear()).append(".").append(String.format("%02d",ido.getMonthValue())).append(".").
                append(String.format("%02d",ido.getDayOfMonth())).append(" ").
                append(String.format("%02d",ido.getHour())).append(":").append(String.format("%02d",ido.getMinute())).
                append(" időpontban: ").append(viz).append("ml");
        System.out.println(sb.toString());
    }


    public VizAdagolo clone(VizAdagolo h){
        return new VizAdagolo(h.getPozicio().getX(), h.getPozicio().getY(), h.getAlsoHatar(), h.getFelsoHatar());
    }

    @Override
    public String toString() {
        return String.format("VizAdagolo: %s, A:%d - F:%d",
                super.toString(), alsoHatar, felsoHatar);
    }
    }
}

}
