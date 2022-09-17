public class Ora1{
    //public int inc(int x){
    //    return x * x;
    //}

    static public void printHello(String f){
        System.out.println("Hello " + f);
    }
    public static void main(String[] args){
        System.out.println("hello world!");

        int n = 5;
        float f = 2.1f;
        char c = 'c';
        String s = "string";
        final int n2 = 3;
        double d = 3.2f;
        boolean t = true;

        System.out.println(n);
        System.out.println(f);
        System.out.println(c);
        System.out.println(s);
        System.out.println(n2);
        System.out.println(d);
        System.out.println(t);
        System.out.println(n+f);

        String str = "Szoveg";
        System.out.println("A string hossza: " + str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("a ov karaktersorozat helye: " + str.indexOf("ov"));

        String s1 = "a";
        String s2 = "b";
//        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        int rand = (int) (Math.random()*101);
        System.out.println(rand);

        if (rand > 50) {
            System.out.println("50nél nagyobb");
        } else if (rand > 20) {
            System.out.println("20nál nagyobb de 50nél kevesebb");
        }
        else{
            System.out.println("20nál kissebb");
        }

        String result = (rand < 50) ? "<50" : ">=50";
        System.out.println(result);
        switch (rand) {
            case 10 -> System.out.println("tiz");
            case 20 -> System.out.println("husz");
            default -> System.out.println("más");
        }


        String[] abc = {"a","b","c","d","e"};
        for (String i: abc){
            System.out.println(i);
        }

        abc[0] = "g";
        for (String i: abc){
            System.out.println(i);
        }

        System.out.println(abc.length);

        int[][]numbers = {{1,2,3,4},{5,6,7,8}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
        printHello("Rebeka");
        for(String arg : args){
            System.out.println(arg);
        }

        //Fruit f1;
        //Fruit f2 = new Fruit();
        Fruit f3 = new Fruit(0,"alma","piros");
        Fruit f4 = new Fruit(0,"narancs","narancs");
        System.out.println(f3.getNev());
        System.out.println(f3.getId());

        System.out.println(f3);

        String alma = "alma";
        System.out.println(alma.equals("alma"));
        System.out.println(f3.equals(f4));

    }
}