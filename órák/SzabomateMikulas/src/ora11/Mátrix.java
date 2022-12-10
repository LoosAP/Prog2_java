package ora11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Mátrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> matrix = new ArrayList<>();

        try {
            File file = new File("matrix.txt");
            Scanner sc = new Scanner(file);
// az első szám az a karakterek száma lesz amugy, de a tied is cuki lett
            while(sc.hasNextLine()){
                int szamlalo = 0;
                Scanner rowReader = new Scanner(sc.nextLine());
                rowReader.useDelimiter(";");
                ArrayList<String> array = new ArrayList<>();
                for (int i = 0; i <= szamlalo; i++) {
                    array.add(rowReader.next());
                    if (rowReader.hasNext()){
                        szamlalo++;
                    }
                }
                matrix.add(array);
            }
            System.out.println(matrix);
        }
        catch (FileNotFoundException e){
            System.out.println("a fájl nem található");
        }

        matrix.stream().forEach(x ->x.forEach(System.out::println));
    }
}
