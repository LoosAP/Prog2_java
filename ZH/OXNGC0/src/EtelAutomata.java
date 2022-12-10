import org.example.Formatum;
import org.example.Pozicio;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class EtelAutomata extends Automata implements IEtelAutomata{
    private Formatum formatum;
    public EtelAutomata(int x, int y,Formatum formatum) {
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
    public void adatkuldes() {
        System.out.println("Adat mentve: " + eteltAdagol());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public String eteltAdagol() throws AutomataInaktivException {
        StringBuilder sb = new StringBuilder();
        if(!this.isAktiv()){
            AutomataInaktivException inaktiv = new AutomataInaktivException();
            throw inaktiv;
        }
        else{
            LocalDateTime ido = LocalDateTime.now();

            sb.append(ido.getYear()).append("-").append(String.format("%02d",ido.getMonthValue())).append("-").
                    append(String.format("%02d",ido.getDayOfMonth())).append("_").
                    append(String.format("%02d",ido.getHour())).append("-").append(String.format("%02d",ido.getMinute())).
                    append("_x").append(this.getPozicio().getX()).append("_y").append(this.getPozicio().getY()).append(formatum).append(".TXT");
            return sb.toString();
        }}

    public EtelAutomata clone(EtelAutomata a){
        return new EtelAutomata(a.getPozicio().getX(), a.getPozicio().getY(), a.getFormatum());
    }

    @Override
    public Formatum getFormatum() {
        return this.formatum;
    }

    @Override
    public String toString() {
        return String.format("EtelAutomata: %s, Formatum: %s",
                super.toString(), formatum);
    }
}
