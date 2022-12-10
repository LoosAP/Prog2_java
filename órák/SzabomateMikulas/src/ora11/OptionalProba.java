package ora11;

import java.util.Optional;

public class OptionalProba {
    public static void main(String[] args) {
        Integer v1 = null;
        Integer v2 = 10;

        Optional<Integer> a = Optional.ofNullable(v1);
        Optional<Integer> b = Optional.of(v2);
        System.out.print(a.isPresent());
        System.out.println(b.isPresent());
        System.out.println(b);

        System.out.println(sum(b,a));
    }
    public static Integer sum(Optional<Integer> a, Optional<Integer> b){
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        Integer v1 = a.orElse(0);
        Integer v2 = 0;
        if (b.isPresent()){
            v2 = b.get();
        }
        /*
        else {
            v2 = b.orElse(0);
        }

         */

        return v1 + v2;
    }
}
