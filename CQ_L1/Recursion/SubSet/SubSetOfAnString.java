package CQ_L1.Recursion.SubSet;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SubSetOfAnString {
    public static void main(String[] args) {
        String up="abc";
        List<String> p =new ArrayList<>();
        RecSubSet(up,"", p);

        //RECURSION VOID TYPE
        System.out.println(RecArraySubSet(up,""));
        //RECURSION RETURN TYPE
        System.out.println(p);
        // ITERATIVE TYPE
        System.out.println(iSubSet(up));
    }

    private static void RecSubSet(String up, String p, List<String> strings) {
        if(up.isEmpty()) {
            if(!p.isEmpty())
                strings.add(p);
            return;
        }

        RecSubSet(up.substring(1),p+up.charAt(0),strings);

        RecSubSet(up.substring(1),p,strings);
    }
    private static ArrayList<String> RecArraySubSet(String up, String p) {
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            if(!p.isEmpty())
                list.add(p);
            return list;
        }
        ArrayList<String> left = RecArraySubSet(up.substring(1),p+up.charAt(0));
        ArrayList<String> right = RecArraySubSet(up.substring(1),p);

        left.addAll(right);
        return left;
    }

    private static List<List<Character>> iSubSet(String up)
    {
        List<List<Character>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        for (char ch : up.toCharArray()) {
            int size = lists.size();
            for (int j = 0; j < size; j++) {
                List<Character> subset = new ArrayList<>(lists.get(j));
                subset.add(ch);
                lists.add(subset);
            }
        }
        return lists;
    }
//    private static List<List<Character>> iSubSet(char[] up) {
//        List<List<Character>> lists = new ArrayList<>();
//        lists.add(Collections.emptyList()); // Add empty set
//
//        for (char c : up) {
//            int numNewLists = lists.size(); // Track number of new lists to create
//
//            // Iterate through existing lists and create new subsets with the new character
//            for (int i = 0; i < numNewLists; i++) {
//                List<Character> subset = new ArrayList<>(lists.get(i));
//                subset.add(c);
//                lists.add(subset);
//            }
//        }
//
//        return lists;
//    }
}
