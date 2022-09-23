
package ora3;

abstract class Animal implements FirstInterface { //extends XY
    //public void method1();
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
    final int a = 0;
    final static int b= 0;
    int c = 0;
    static int d = 0;
}

class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Oink");
    }

    @Override
    public void method1() {
        System.out.println("Method 1");
    }
}
public class Abstact {
    public static void main(String[] args){
        //Animal a = new Animal();
        Pig p = new Pig();

        p.animalSound();
        p.sleep();
        p.method1();

        Animal a2 = new Animal() {
            @Override
            public void animalSound() {
                System.out.println("Állati hangok");
            }

            @Override
            public void method1() {
                System.out.println("Method 1");
            }
        };
        a2.sleep();
        a2.animalSound();
    }
}
