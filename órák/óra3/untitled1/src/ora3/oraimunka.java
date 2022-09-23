package ora3;

import java.time.LocalDate;
import java.util.Scanner;

interface I1{
    public void i1();
}
interface I2 extends I1{
    public void i2();
}
interface I3 extends I1{
    public void i3();
}
abstract class A1 implements I2, I3{
    public abstract void a1();

}
abstract class A2 extends A1{
    public abstract void a2();
}
class C extends A2{

    @Override
    public void i1() {
        System.out.println("I1");
    }

    @Override
    public void i2() {
        System.out.println("I2");
    }

    @Override
    public void i3() {
        System.out.println("I3");
    }

    @Override
    public void a1() {
        System.out.println("A1");
    }

    @Override
    public void a2() {
        System.out.println("A2");
    }
}
public class oraimunka {
    public static void main(String[] args){
        C c = new C();
        c.a1();
        c.a2();
        c.i1();
        c.i2();
        c.i3();

        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a dátumot (év,hónap,nap)");
        LocalDate date1 = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("120 nap mulva ennyi lesz a dátum: " + date1.plusDays(120).getDayOfWeek());


    }
}
