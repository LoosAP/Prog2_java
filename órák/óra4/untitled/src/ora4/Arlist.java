package ora4;

import java.util.*;

public class Arlist {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        /*System.out.println(numbers.get(0));
        numbers.set(0,10);
        System.out.println(numbers.get(0));
        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }
        numbers.remove(0);
        System.out.println(numbers.size());

        for(Integer i:numbers){
            System.out.println(i);
        }*/
        //bubble sort a legjobb tanárúr szerint

        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.sort((o1,o2) -> o1-o2);
        System.out.println(numbers);
        numbers.sort(Comparator.comparingInt(o->o));
        System.out.println(numbers);

        numbers.clear();
        List<String> list = new ArrayList<>();
        String[] a = new String[]{"A","B","C","D"};
        list = Arrays.asList(a);

        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(1);
        linked.add(2);
        linked.add(3);
        linked.add(4);
        linked.addFirst(5);
        linked.addLast(6);
        linked.set(3,50);
        linked.remove(2);
        linked.removeFirst();
        linked.removeLast();
        System.out.println(linked.get(1));
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
    }
}
