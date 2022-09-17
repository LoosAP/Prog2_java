package cs14;

import java.util.Scanner;

class Animal{
    int age;
    String name;

    public Animal(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalSound(){
        System.out.println("Hangot ad az állat");

    }
}

class Pig extends Animal{
    Double weight;

    public Pig(Integer age, String name, Double weight){
        super(age,name);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void animalSound() {
        System.out.println("Röff Röff");
    }
}

class Dog extends Animal{
    private Integer friend;

    public Dog(Integer age, String name, Integer friend) {
        super(age, name);
        this.friend = friend;
    }

    public Integer getFriend(){
        return friend;
    }
    public void setFriend(int friend){
        this.friend = friend;
    }
    public void animalSound() {
        System.out.println("Vau Vau");
    }
}

public class Main {
    public static void main(String[] args){
     /*   Animal a1 = new Animal();
        Pig p1 = new Pig();
        Dog d1 = new Dog();

        a1.animalSound();
        p1.animalSound();
        d1.animalSound();

        Pig p2 = new Pig();
        Dog d2 = new Dog();
        System.out.println(p2.getWeight());
        p2.setWeight(500.2);
        System.out.println(p2.getWeight());
        System.out.println(d2.getFriend());
        d2.setFriend(1551);
        System.out.println(d2.getFriend());

        Scanner sc = new Scanner(System.in);
        Dog d3 = new Dog();
        System.out.println("Adja meg a kutya tulajdonságait!(életkora, neve,barátjai sorrendben)");
        d3.setAge(Integer.parseInt(sc.nextLine()));
        d3.setName(sc.nextLine());
        d3.setFriend(Integer.parseInt(sc.nextLine()));
        System.out.println("A kutya életkora: " +d3.getAge() + " A kutya neve: " + d3.getName() + " A kutya barátainak száma: " + d3.getFriend());
        */
        Dog d4 = new Dog(8,"Piszok",50);
        Pig p4 = new Pig(10,"Dezső",500.0);

        System.out.println(d4.getAge() > p4.getAge()?"the dog is older": "the pig is older");
    }

}
