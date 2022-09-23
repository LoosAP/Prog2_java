package ora3;
interface FirstInterface {
    public void method1()/*{}*/;
}
interface SecondInterface extends FirstInterface{
    public void method2();
}

class DemoClass implements SecondInterface,FirstInterface{
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }
}

public class Interface {
    public static void main(String[] args){
        DemoClass dc = new DemoClass();
        dc.method1();
        dc.method2();
    }

}
