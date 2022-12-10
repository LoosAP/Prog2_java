import java.time.LocalDateTime;
import java.time.LocalTime;

public class Kamera extends Szenzor implements  IKamera, Cloneable{
    private Kepformatum formatum;



    @Override
    public Kepformatum getFormatum() {
        return formatum;
    }


    public Kamera(int x, int y, Kepformatum formatum) {
        super(new Pozicio(x, y));
        this.formatum = formatum;
    }

    @Override
    public Boolean isAktiv() {
        LocalTime ido = LocalTime.now();
        LocalTime also = LocalTime.of(7,0,0);
        LocalTime felso = LocalTime.of(21,0,0);
        if(ido.isBefore(also) || ido.isAfter(felso)){
            return false;
        }
        return true;
    }



    @Override
    public String kepetKeszit() throws SzenzorInaktivException{
        StringBuilder sb = new StringBuilder();
        if(!this.isAktiv()){
            SzenzorInaktivException SzenzorInaktivException = new SzenzorInaktivException();
            throw SzenzorInaktivException;

        }
        else{
            LocalDateTime ido = LocalDateTime.now();

            sb.append(ido.getYear()).append("-").append(String.format("%02d",ido.getMonthValue())).append("-").
                    append(String.format("%02d",ido.getDayOfMonth())).append("_").
                    append(String.format("%02d",ido.getHour())).append("-").append(String.format("%02d",ido.getMinute())).
                    append("_x").append(this.getPozicio().getX()).append("_y").append(this.getPozicio().getY()).append(".PNG");
            return sb.toString();
        }

    }

    @Override
    public void adatkuldes() {
        System.out.println(kepetKeszit());
    }

    public Kamera clone(Kamera kb){
        return new Kamera(kb.getPozicio().getX(), kb.getPozicio().getY(), kb.getFormatum());
    }

    @Override
    public String toString() {
        return String.format("Kamera: %s, Formátum: %s",
                super.toString(), formatum);
    }
}
