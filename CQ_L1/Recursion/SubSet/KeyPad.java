package CQ_L1.Recursion.SubSet;

import java.util.ArrayList;
import java.util.List;

public class KeyPad {
    public static void main(String[] args) {
        int key=7;
        System.out.println(key(Integer.toString(key),""));
    }
    static List<String> key(String up,String p)
    {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        int index =up.charAt(0)-'0';
        if(index == 9) {
            for (int i = (index * 3) - 2; i < (index * 3)+2; i++) {
                list.addAll(key(up.substring(1), p + (char) ('a' + i - 3)));
            }
        }
        if(index == 7)
        {
            for (int i = (index-1) * 3; i < (index * 3) +1 ; i++) {
                list.addAll(key(up.substring(1), p + (char) ('a' + i - 3)));
            }
        }
        if(index == 8)
        {
            for (int i = ((index - 1) * 3) +1; i < (index * 3)+1; i++) {
                list.addAll(key(up.substring(1), p + (char) ('a' + i - 3)));
            }
        }
        else {
            for (int i = (index - 1) * 3; i < (index * 3); i++) {
                list.addAll(key(up.substring(1), p + (char) ('a' + i - 3)));
            }
        }
        return list;
    }
}
