package ora7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Personolvas {
    public static void main(String[] args){
        ArrayList<Person> embersor = new ArrayList<>();
        try {

            File emberek = new File("C:\\Users\\Hp\\Documents\\java\\órák\\ora7\\src\\allomany.txt");

            Scanner reader = new Scanner(emberek);
            while (reader.hasNextLine()){
                Scanner sorReader = new Scanner(reader.nextLine());
                sorReader.useDelimiter(";");
                while (sorReader.hasNext()){
                    Person ember = new Person(sorReader.next(),sorReader.nextInt(),sorReader.nextInt(),sorReader.nextInt());
                    /*ember.setNev(sorReader.next());
                    ember.setKor(sorReader.nextInt());
                    ember.setSúly(sorReader.nextInt());
                    ember.setMagasság(sorReader.nextInt());
                    sorReader.close();*/
                    embersor.add(ember);
                    System.out.println(ember.getNev()+ " " + ember.getKor()+ " "+  ember.getMagasság()+" "+ ember.getSúly());
                }
            }
            for (int i = 0; i < embersor.toArray().length; i++) {
                System.out.println(embersor.get(i));
            }
        }
        catch (IOException e){
            System.out.println("valami nem jó: " + e);
            return;
        }

    }
}
