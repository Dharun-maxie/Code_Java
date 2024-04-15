package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatedSubString {
    public static void main(String[] args) {
        String q1 = "abcdabcbb";

        String q2 = "bbbbbb";

        String q3 = "pwwkew";

        String q4 = "abcd";

        System.out.println(LongestSubString(q4));
    }

    public static int LongestSubString(String x)
    {
        int max=0, i=-1;

        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < x.length(); j++) {
            if(!map.isEmpty()){
                if(map.containsKey(x.charAt(j))){
                    i=j-map.get(x.charAt(j));
                    map.replace(x.charAt(j),j);
                }
            }
            max=Math.max(max,i);
            map.put(x.charAt(j),j);
        }

        return max;
    }
}
