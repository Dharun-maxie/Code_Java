package CQ_L1.Recursion.SubSet;

import java.util.ArrayList;
import java.util.List;

public class SubSetOfDuplicate {
    public static void main(String[] args) {
        String up="123";
        System.out.println(InterativeSubsetIgnoreDup(up));
    }

    private static List<List<Character>> InterativeSubsetIgnoreDup(String up) {
        List<List<Character>> lists = new ArrayList<>();

        lists.add(new ArrayList<>());
        int s,e=0;
        for (int i = 0; i < up.length(); i++) {
            s=0;
            if(i>0  && up.charAt(i) == up.charAt(i-1))
                s=e+1;
            e= lists.size();
            for (int j = s; j < e; j++) {
                List<Character> subList =new ArrayList<>(lists.get(j));
                subList.add(up.charAt(i));
                lists.add(subList);
            }
        }
        return lists;
    }
}
