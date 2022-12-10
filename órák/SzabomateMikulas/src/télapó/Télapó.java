package télapó;

import mikulás.Ajándék;
import mikulás.AjándékCsomag;
import mikulás.GyerekJáték;
import mikulás.Puttony;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Télapó {
    public static double[] átlagÉrték(AjándékCsomag[] ajándékCsomags){
        double[] átlagok = new double[ajándékCsomags.length];
        for (int i = 0; i<átlagok.length;i++){
            if (ajándékCsomags[i] ==null ||ajándékCsomags[i].nehezekSzáma(0.0) ==0){
                átlagok[i] = 0;
            }
            else {
                átlagok[i] = ((double) ajándékCsomags[i].összÉrték()) / ajándékCsomags[i].nehezekSzáma(0.0);

            }
        }
        return átlagok;
    }

    public static void main(String[] args) throws IOException{

        ArrayList<Ajándék> ajándéks = new ArrayList<>();
        if(args.length <1){
            System.out.println("A beolvasandó fájl nevét adja meg!");
            return;
        }
        File file = new File(args[0]);
        try {
        Scanner fileReader = new Scanner(file);
        while(fileReader.hasNextLine()){
            Scanner rowReader = new Scanner(fileReader.nextLine());
            rowReader.useDelimiter(";");
            String név = rowReader.next();
            double tömeg = rowReader.nextDouble();
            int ár = rowReader.nextInt();
            System.out.print(név+ " " + tömeg+ " " + ár);
            if (rowReader.hasNext()){
                ajándéks.add(new GyerekJáték(név,tömeg,ár,rowReader.nextInt()));
            }
            else {
                ajándéks.add(new Ajándék(név,tömeg,ár));
            }
        }
        }
        catch (IOException e){
            System.out.println("valami nem jó: " + e);
            return;
        }
        System.out.println(ajándéks);

        Puttony puttony = null;
        Puttony p2 = new Puttony(args.length==2 ? args[1] : "a világ összes gyereke", ajándéks.toArray(new Ajándék[0]));
        if(args.length == 2){
            puttony = new Puttony(args[1],ajándéks.toArray(new Ajándék[0]));
        }
        else {
            puttony = new Puttony("a világ összes gyereke",ajándéks.toArray(new Ajándék[0]));
        }
        System.out.println(puttony);

        if (puttony.gyerekjátékok().isEmpty()){
            System.out.println("Nincs Gyerekjáték a puttonyban");
        }
        else {
            ArrayList<GyerekJáték> gyerekJátéks = new ArrayList<>(puttony.gyerekjátékok());
            Collections.sort(gyerekJátéks);
            System.out.println(gyerekJátéks.get(0));
        }

        Scanner bill = new Scanner(System.in);
        System.out.println("Adjon meg egy korhatárt");
        int korhatár = bill.nextInt();
        try{

        System.out.println(puttony.játékkorhatár(korhatár));
        }
        catch (IllegalArgumentException e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        Puttony[] puttonyok = new Puttony[2];
        puttonyok[0] = puttony;
        puttonyok[1] = null;
        System.out.println(Arrays.toString(átlagÉrték(puttonyok)));
        for (double d : átlagÉrték(puttonyok)){
            System.out.println(d);
        }

    }
}
