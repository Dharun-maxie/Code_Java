package Collections;

import java.util.Map;
import java.util.HashMap;
class Mapp
{
    public static void main(String[] args)
    {
        Map<Integer, Integer> map =new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(i,(int) (i*(Math.random() * 10)));
        }
        for(int i : map.keySet())
        {
            System.out.println(STR."Key : \{i}, Value : \{map.get(i)}");
        }
    }
}
