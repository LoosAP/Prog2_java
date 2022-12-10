import java.io.*;
import java.util.*;
public class Main
{
    static void TelepitSzenzorHalozat(String input, AdagoloModul adagoloModul)
    {
        try {
            File file = new File(input);
            Scanner myReader;
            myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String sor = myReader.nextLine();
                String[] adatok = sor.split(";");
                System.out.println("adatok[0]: " + adatok[0]);
                System.out.println("adatok[1]: " + adatok[1]);
                System.out.println("adatok[2]: " + adatok[2]);
                System.out.println("adatok[3]: " + adatok[3]);
                if (adatok[0].equals("V")) {
                    Adagolo vizAdagolo = new VizAdagolo(
                            Integer.parseInt(adatok[1]),
                            Integer.parseInt(adatok[2]),
                            Integer.parseInt(adatok[3]),
                            Integer.parseInt(adatok[4]));
                    adagoloModul.telepit(vizAdagolo);
                } else {
                    Adagolo tapAdagolo = new TapAdagolo(
                            Integer.parseInt(adatok[1]),
                            Integer.parseInt(adatok[2]),
                            org.example.Formatum.valueOf(adatok[3]));
                    adagoloModul.telepit(tapAdagolo);
                }
            }

            System.out.println(adagoloModul.aktivAdagolok().size());

            for (Adagolo ad:adagoloModul.aktivAdagolok()
            ) {
                System.out.println(ad);

            }

            myReader.close();
        }catch(FileNotFoundException f){
            System.out.println(f);
        }
        catch (AdagoloInaktivException ad){
            System.out.println(ad);
        }
        catch (AlacsonyAlsoHatarException a){
            System.out.println(a);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        }
    }

    public static void main(String[] args)
    {
        AdagoloModul adagoloModul = new AdagoloModul();
        TelepitSzenzorHalozat("C:\\Temp\\adagolok.csv", adagoloModul);

    }
}