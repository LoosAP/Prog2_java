package beugró;

import egyetem.Demonstrátor;
import egyetem.Egyetem;
import egyetem.Oktató;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;


public class Beugró {

    public static Oktató[] InformatikaTanár (Collection<Oktató> coll){
        ArrayList<Oktató> informatikaTanárok = new ArrayList<>();
        for (Oktató o: coll){
            if (o.getClass().equals(Demonstrátor.class)){
                Demonstrátor d = Demonstrátor o;
                if (d.getSzak().equals("informatikatanár")){
                    informatikaTanárok.add(o);
                }
            }
        }
        Oktató[] infoTanárok = new Oktató[iformatikaTanárok.size()];
        return informatikaTanárok.toArray(infoTanárok);
        return null;
    }
    public static void main(String[] args){
        for(Oktató o : informatikaTanár(halmaz)) {
            System.out.print(o);
        }
    }
}

    public static void printDolgozokSzama(Egyetem[] egyetems){
        for (Egyetem e : egyetems){
            System.out.print(e.oktatók().size());
        }
    }
    public static void neptunMegtalálható(Collection<Oktató> coll, String neptunKód){
        boolean megtalálható = false;
        Oktató oktató = null;
        for(Oktató o : coll){
            if(o.getNeptunKód().equals(neptunKód)){
                megtalálható = true;
                oktató = o;
            }
        }
        if(megtalálható){
            System.out.println(oktató.getNév() + " " + oktató.getTanszék());
        } else { System.out.println("Oktató nem található");
        }
    }

    public static void Main(String[] args){
        HashSet<Oktató> halmaz = new HashSet<>();
        Scanner olvasó = new Scanner(System.in);
/*
        Oktató o1 = new Oktató(olvasó.nextLine(),olvasó.nextLine(),olvasó.nextLine());
        Demonstrátor d1 = new Demonstrátor(olvasó.nextLine(),olvasó.nextLine(),olvasó.nextLine());
        Oktató o2 = new Oktató(olvasó.nextLine(),olvasó.nextLine(),olvasó.nextLine());
        Demonstrátor d2 = new Demonstrátor(olvasó.nextLine(),olvasó.nextLine(),olvasó.nextLine());
    halmaz.add(o1,d1,o2,d2);
*/
    for (int i=1; i<=4; i++)
        if (i % 2 == 0){
            Demonstrátor d = new Demonstrátor(olvasó.nextLine(),olvasó.nextLine(),olvasó.nextLine());
            halmaz.add(d);
        } else {
            Oktató o = new Oktató(olvasó.nextLine(),olvasó.nextLine(),olvasó.nextLine());
        }

    neptunMegtalálható(halmaz,"a");

    }
}
