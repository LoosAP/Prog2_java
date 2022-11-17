package mikulás;

import java.util.ArrayList;
import java.util.Collections;

public class Teszt {

    public static void main(String[] args) {
        ArrayList<Ajándék> ajándéks = new ArrayList<>();
        ajándéks.add(new Ajándék("b",10.1,2));
        ajándéks.add(new Ajándék("a",9.2,2));
        ajándéks.add(new Ajándék("c",6.0,6));

        Collections.sort(ajándéks);
        System.out.println(ajándéks);
    }
}
