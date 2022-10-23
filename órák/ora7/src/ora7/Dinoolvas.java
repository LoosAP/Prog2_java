package ora7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Dinoolvas {
    public static void main(String[] args){
        if(args.length <1){
            System.out.println("A beolvasandó fájl nevét adja meg!");
            return;
        }
        File file = new File(args[0]);
        try{
            Scanner olvaso = new Scanner(file);
            while (olvaso.hasNextLine()){
                Scanner sorOlvasó = new Scanner(String.valueOf(olvaso.hasNextLine()));
                sorOlvasó.useDelimiter(";");
                if (sorOlvasó.next().equals("H")){
                    String faj = sorOlvasó.next();
                    String élettér = sorOlvasó.next();
                    boolean növényevő = false;
                    if (sorOlvasó.hasNext()){
                        if (sorOlvasó.next().equals("N")){
                            növényevő = true;
                        }
                    }
                    System.out.println(faj + " " + élettér + " " + növényevő);
                }
                else if (sorOlvasó.next().equals("D")){
                    String faj = sorOlvasó.next();
                    boolean növényevő = false;
                    if (sorOlvasó.hasNext()){
                        if (sorOlvasó.next().equals("N")){
                            növényevő = true;
                        }
                    }
                    Double testhossz = sorOlvasó.nextDouble();
                    int testtömeg = sorOlvasó.nextInt();
                    System.out.println(faj +  " " + növényevő + " "  + testhossz + " " + testtömeg);
                }


            }
        }
        catch (IOException e){
            System.out.println("Nincs ilyen fájl");
            return;
        }
    }
}
