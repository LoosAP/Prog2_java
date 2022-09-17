package cs14;
class OuterClass{
    int x = 1;

    class InnerClass{
        int y = 2;

    }
}
public class OIMain {
    public static void main(String[] args){
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();

        System.out.println(oc.x+ ic.y);
    }
}
