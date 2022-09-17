package cs14;

class Vehicle{
    protected String brand = "Nissan";
    public void honk(){
        System.out.println("Honk Honk");
    }

}

public class Car extends Vehicle {
    @Override
    public String toString() {
        return brand + " " + modelName;
    }

    public String adatok(){
        return "Márka: " + brand +" | "+ "Modell: " + modelName;
    }
    private String modelName = "Xyz";
    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println(c1.toString());
        System.out.println(c1.adatok());

    }
}
