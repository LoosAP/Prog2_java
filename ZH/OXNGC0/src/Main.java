
import java.io.*;
import java.util.*;
public class Main
{
    static void TelepitSzenzorHalozat(String input, AutomataModul automataModul)
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
                if (adatok[0].equals("I")) {
                    Automata italAutomata = new ItalAutomata(
                            Integer.parseInt(adatok[1]),
                            Integer.parseInt(adatok[2]),
                            Integer.parseInt(adatok[3]),
                            Integer.parseInt(adatok[4]));
                    automataModul.telepit(italAutomata);
                } else {
                    Automata etelAutomata = new EtelAutomata(
                            Integer.parseInt(adatok[1]),
                            Integer.parseInt(adatok[2]),
                            org.example.Formatum.valueOf(adatok[3]));
                    automataModul.telepit(etelAutomata);
                }
            }
            myReader.close();
        }catch(AlacsonyAlsoHatarException e){
            System.out.println(e);
        }
        catch(IOException e){
            e.printStackTrace();
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        AutomataModul automataModul = new AutomataModul();
        TelepitSzenzorHalozat("C:\\Temp\\automatak.csv", automataModul);

    }
}