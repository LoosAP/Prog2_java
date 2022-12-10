import org.example.Pozicio;

import java.time.LocalDateTime;
import java.util.Locale;

public class ItalAutomata extends Automata implements IItalAutomata{
    private int alsoHatar;
    private int felsoHatar;
    private Boolean aktiv;

    public void setAktiv(Boolean aktiv) {
        this.aktiv = aktiv;
    }

    public int getAlsoHatar() {
        return alsoHatar;
    }

    private void setAlsoHatar(int alsoHatar) {
        try {

            if (alsoHatar > 200) {
                this.alsoHatar = alsoHatar;
            } else {
                Exception AlacsonyAlsoHatarException = new AlacsonyAlsoHatarException();
                throw AlacsonyAlsoHatarException;
            }
        } catch (AlacsonyAlsoHatarException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ItalAutomata(int x, int y, int alsoHatar, int felsoHatar) {
        super(new Pozicio(x,y));
        hatarokatBeallit(alsoHatar,felsoHatar);
    }

    public int getFelsoHatar() {
        return felsoHatar;
    }

    private void setFelsoHatar(int felsoHatar) {
        this.felsoHatar = felsoHatar;
    }


    @Override
    public boolean isAktiv() {
        return this.aktiv;
    }

    @Override
    public void adatkuldes() {
        LocalDateTime ido = LocalDateTime.now();

        double ital = this.italtAdagol();

        StringBuilder sb = new StringBuilder();

        sb.append("Adagolt kóla a(z) (").append(this.getPozicio().getX()).append(";").append(this.getPozicio().getY()).
                append(") pozición ").append(ido.getYear()).append(".").append(String.format("%02d",ido.getMonthValue())).append(".").
                append(String.format("%02d",ido.getDayOfMonth())).append(" ").
                append(String.format("%02d",ido.getHour())).append(":").append(String.format("%02d",ido.getMinute())).
                append(" időpontban: ").append(ital).append("ml");
        System.out.println(sb.toString());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public double italtAdagol() {
        try {
            if(this.isAktiv()){
                double random = Math.random();
                random = random*(felsoHatar-alsoHatar)+alsoHatar;

                return Double.parseDouble(String.format(Locale.ENGLISH,"%.2f",random));


            }
        }catch (AutomataInaktivException e){
            e.printStackTrace();
        }
        return 0.0;
    }
    public ItalAutomata clone(ItalAutomata i){
        return new ItalAutomata(i.getPozicio().getX(), i.getPozicio().getY(), i.getAlsoHatar(), i.getFelsoHatar());
    }
    @Override
    public void hatarokatBeallit(int alsoHatar, int felsoHatar) {
        setAlsoHatar(alsoHatar);
        setFelsoHatar(felsoHatar);
    }

    @Override
    public String toString() {
        return String.format("ItalAutomata: %s, A:%d - F:%d",
                super.toString(), alsoHatar, felsoHatar);
    }
}
