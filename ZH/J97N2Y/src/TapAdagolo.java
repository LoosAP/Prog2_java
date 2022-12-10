import org.example.Formatum;
import org.example.Pozicio;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TapAdagolo extends Adagolo implements ITapAdagolo, Cloneable{
    private Formatum formatum;

    @Override
    public Formatum getFormatum() { return formatum; }

    public TapAdagolo(int x, int y,Formatum formatum) {
        super(new Pozicio(x,y));
        this.formatum = formatum;
    }
    @Override
    public boolean isAktiv() {
        LocalTime ido = LocalTime.now();
        LocalTime also = LocalTime.of(4,0,0);
        LocalTime felso = LocalTime.of(23,0,0);
        if(ido.isBefore(also) || ido.isAfter(felso)){
            return false;
        }
        return true;
    }

    @Override
    public String tapotAdagol() throws AdagoloInaktivException{
        StringBuilder sb = new StringBuilder();
        if(!this.isAktiv()){
            AdagoloInaktivException AdagoloInaktivException = new AdagoloInaktivException();
            throw AdagoloInaktivException;
        }
        else{
            LocalDateTime ido = LocalDateTime.now();

            sb.append(ido.getYear()).append("-").append(String.format("%02d",ido.getMonthValue())).append("-").
                    append(String.format("%02d",ido.getDayOfMonth())).append("_").
                    append(String.format("%02d",ido.getHour())).append("-").append(String.format("%02d",ido.getMinute())).
                    append("_x").append(this.getPozicio().getX()).append("_y").append(this.getPozicio().getY()).append(formatum).append(".TXT");
            return sb.toString();
        }}

        public void adatkuldes() {
            System.out.println(tapotAdagol());
        }

        public Adagolo clone(Adagolo adag){
            return new Adagolo(adag.getPozicio().getX(), adag.getPozicio().getY(), adag.getFormatum());
        }

        @Override
        public String toString() {
            return String.format("TapAdagolo: %s, Formatum: %s",
                    super.toString(), formatum);
        }
    }

