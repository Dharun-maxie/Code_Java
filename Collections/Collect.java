package Collections;

import java.util.*;

public class Collect
{
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<>(); // -> List
        Set<Integer> list2 = new HashSet<>();    // -> Set
        Set<Integer> list3 = new TreeSet<>();    // -> Set

        for (int i = 1; i <= 10; i++) {
            list1.add((int) (i*(Math.random() * 10)));
            list2.add((int) (i*(Math.random() * 10)));
            list3.add((int) (i*(Math.random() * 10)));
        }

        Iterator<Integer> l1 = list1.iterator();
        Iterator<Integer> l2 = list2.iterator();
        Iterator<Integer> l3 = list3.iterator();

        while(l1.hasNext())
        {
            System.out.print(STR."\{l1.next()} ");
        }
        System.out.println();
        while(l2.hasNext())
        {
            System.out.print(STR."\{l2.next()} ");
        }
        System.out.println();
        while(l3.hasNext())
        {
            System.out.print(STR."\{l3.next()} ");
        }
    }
}
