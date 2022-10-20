package ora6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//[a-z]
//[A-Z]
//[0-9]
//? 0 vagy 1 előfordulás
//+ 1 vagy több előfordulás
//*0 vagy több előfordulás
//ab potosan 1 a, amit 1 b követ
//\\.

public class Regex {
    public static void main(String[] args){
        //pattern matchert hallunk akkor reguláris kifejezésről lesz szó
        //Pattern pattern = Pattern.compile("debrecen",Pattern.CASE_INSENSITIVE);
        //Matcher matcher = pattern.matcher("Debreceni Egyetem");
        //boolean matchFound = matcher.find();
        //System.out.println(matchFound);
        //if (matchFound){
           // System.out.println("Megvan úristen omg");
        //}
        //else {
          //  System.out.println("Nincs egyezés");
        //}

        String email = "user@mail.com"; //usermail.com, user@mailcom

        //"[A-Z0-9]{3,}+@+[A-Z0-9]++\\.[A-Z0-9]{2,6}" tanárur szerint
        Pattern emailpattern = Pattern.compile("[A-Z0-9]{3,}+@+[A-Z0-9]++\\.[A-Z0-9]{2,6}" ,Pattern.CASE_INSENSITIVE);
        //Pattern pontpattern = Pattern.compile("\\.",Pattern.CASE_INSENSITIVE);
        Matcher emailmatcher = emailpattern.matcher(email);
       // Matcher pontmatcher = pontpattern.matcher(email);
        boolean emailmatchFound = emailmatcher.find() ;
        //boolean pontmatchFound = pontmatcher.find();
        System.out.println(emailmatchFound);
        if (emailmatchFound){
                System.out.println("namegvagytekisbudoskutya");
        }
        else {
            System.out.println("Nincs egyezés");
        }
    }
}
