package ora4;

import java.util.Objects;

public class Auto implements Comparable<Auto> {
    private String marka;
    private String tipus;
    private Integer loero;
    private static int count = 0;

    public Auto(){
        this.marka = "";
        this.tipus = "";
        this.loero = 0;
        Auto.count++;
    }

    public Auto(String marka, String tipus, Integer loero) {
        this.marka = marka;
        this.tipus = tipus;
        this.loero = loero;
        Auto.count++;
    }

    public Auto(String marka, Integer loero) {
        this.marka = marka;
        this.loero = loero;
        this.tipus = "?";
        Auto.count++;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public Integer getLoero() {
        return loero;
    }

    public void setLoero(Integer loero) {
        if (loero > 0) {
            this.loero = loero;
        } else {
            System.out.println("0 nál nagyobb settert kell megadni");
        }
    }
    public static int getCount() {
        return count;
    }
    //countra nincs set, statikus


    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", tipus='" + tipus + '\'' +
                ", loero=" + loero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(marka, auto.marka) && Objects.equals(tipus, auto.tipus) && Objects.equals(loero, auto.loero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, tipus, loero);
    }


    @Override
    public int compareTo(Auto o) {
        if (this.loero == o.loero){
            return 0;
        } else if (this.loero > o.loero) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
