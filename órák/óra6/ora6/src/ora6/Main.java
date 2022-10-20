package ora6;

//Error - Kritikus hiba, leállást eredményezhet
//Checked - ellenőrzött kivétel- forditásiidőben, try-catch,throws
//Unchecked -  nem ellenőrzött kivétel,futási időben, nem kötelező a trycatch se a throws, forditaskor nemtudjuk hogy lesz e.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static String beolvasasTesztUnchecked(String fileName){
        try {
            Scanner file = new Scanner(new File(fileName));
            if(file.hasNextLine()){
                return file.nextLine();
            }
            else {
                throw new IllegalArgumentException("Állomány nem olvasható");
            }
        }
        catch (FileNotFoundException | IllegalArgumentException e) {
            if(!fileName.contains(".")){
                throw new IllegalArgumentException("Az állomány nevében"+" nincs kiterjesztés"+ fileName, e);
            }
        }
        //catch (IllegalArgumentException e){}
        return null;
    }
    static void checkAge(int age) throws IncorrectFileNameException{
        if (age<18){

                throw new IncorrectFileNameException("fiatal vagy öcsi");

            //System.out.println("fiatal vagy öcsi");

        }
        else {
            System.out.println("nagy vagy");
        }
    }

    static String beolvasasTeszt(String fileName) throws IncorrectFileNameException{
        try {
            Scanner file = new Scanner(new File(fileName));
            if(file.hasNextLine()){
                return file.nextLine();
            }
        } catch (FileNotFoundException e) {
            if(fileName.contains("á")){
                throw new IncorrectFileNameException("Helytelen állománynév: " + fileName);
            }
        }
        return null;
    }

    public static void main(String[] args){
        try{
            int[] szamok = {1,2,3};
            System.out.println(szamok[3]);
            System.out.println(1);
        }
        catch (Exception e){
            System.out.println("Hiba történt: "+  e);
        }
        finally{
            System.out.println("Try catch vége!");
        }
        System.out.println(2);

        try {
            checkAge(18);
        } catch (IncorrectFileNameException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(beolvasasTeszt("a.txt"));
        } catch (IncorrectFileNameException e) {
            throw new RuntimeException(e);
        }

        //mivel unchecked, felesleges a try-catch blokk, a fordító szerint nem biztos hogy belefutunk a hibába
        try {
            beolvasasTesztUnchecked("á");
        }
        catch (Exception e){

        }
    }
}
