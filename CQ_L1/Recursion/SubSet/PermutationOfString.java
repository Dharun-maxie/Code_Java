package CQ_L1.Recursion.SubSet;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        String s ="abc";
        Perm(s,"");
        System.out.println();
        System.out.println(PermList(s,""));
    }

    private static void Perm(String up, String p) {
        if(up.isEmpty())
        {
            System.out.print(STR."\{p} ");
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            Perm(up.substring(1), p.substring(0,i)+up.charAt(0)+p.substring(i));
        }

    }
    private static List<String> PermList(String up, String p) {
        if(up.isEmpty())
        {
            List<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> lists =new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            lists.addAll(PermList(up.substring(1), p.substring(0,i)+up.charAt(0)+p.substring(i)));
        }
        return lists;
    }
}
