package ora11;

public class defaultProba {
    public static void main(String[] args) {
        Auto kocsi = new Auto();
        kocsi.print();
    }

}
interface Jármű{
    default void print(){
        System.out.println("Jármű vagyok!");
    }
    static void dudál(){
        System.out.println("Honk Honk!");
    }
}

interface Négykerekű{
    default void print(){
        System.out.println("Négy kerekem van!");
    }


}

class Auto implements Jármű,Négykerekű{

    @Override
    public void print() {
        Jármű.super.print();
        Négykerekű.super.print();
        Jármű.dudál();
        System.out.println("Autó vagyok");
    }
}