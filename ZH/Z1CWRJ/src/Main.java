

import java.io.*;
import java.util.*;
public class Main
{
    static void TelepitSzenzorHalozat(String input, SzenzorHalozat halozat)
    {
        try {
            File file = new File(input);
            Scanner myReader;
            myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String sor = myReader.nextLine();
                String[] adatok = sor.split(";");
                /*System.out.println("adatok[0]: " + adatok[0]);
                System.out.println("adatok[1]: " + adatok[1]);
                System.out.println("adatok[2]: " + adatok[2]);
                System.out.println("adatok[3]: " + adatok[3]);*/
                if (adatok[0].equals("H")) {
                    Homero homero = new Homero(
                            Integer.parseInt(adatok[1]),
                            Integer.parseInt(adatok[2]),
                            Integer.parseInt(adatok[3]),
                            Integer.parseInt(adatok[4]));
                    halozat.telepit(homero);
                } else {
                    Kamera kamera = new Kamera(
                            Integer.parseInt(adatok[1]),
                            Integer.parseInt(adatok[2]),
                            Kepformatum.valueOf(adatok[3]));
                    halozat.telepit(kamera);

                }




            }


            System.out.println(halozat.aktivSzenzorok().size());

            for (Szenzor sz: halozat.aktivSzenzorok()
            ) {
                System.out.println(sz);

            }



            myReader.close();


        }catch(FileNotFoundException f){
            System.out.println(f);
        }
        catch (SzenzorInaktivException sz){
            System.out.println(sz);
        }
        catch (AlacsonyAlsoHatarException a){
            System.out.println(a);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        SzenzorHalozat halozat = new SzenzorHalozat();
        TelepitSzenzorHalozat("C:\\Temp\\szenzorok.csv", halozat);

    }
}