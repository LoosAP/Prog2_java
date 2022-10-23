package ora7;

public class Person {
    static int id = 0;
    String nev;
    int kor;
    int súly;
    int magasság;

    public Person(String nev, int kor, int súly, int magasság) {
        this.nev = nev;
        this.kor = kor;
        this.súly = súly;
        this.magasság = magasság;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Person.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getSúly() {
        return súly;
    }

    public void setSúly(int súly) {
        this.súly = súly;
    }

    public int getMagasság() {
        return magasság;
    }

    public void setMagasság(int magasság) {
        this.magasság = magasság;
    }
}
