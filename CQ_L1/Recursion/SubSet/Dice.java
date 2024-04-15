package CQ_L1.Recursion.SubSet;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        int Target = 4;
        int faces = 6;
        System.out.println(PossibleWayToGetTarget(Target,faces,""));
    }

    private static int PossibleWayToGetTarget(int target,int faces,String s) {
        if(target < 0)
            return 0;

        if(target == 0)
        {
            System.out.println(s);
            return 1;
        }
        int Count =0;
        for (int i = 1; i < faces; i++) {
            Count+=PossibleWayToGetTarget(target - i,faces,s+i);
        }
        return Count;
    }

}
