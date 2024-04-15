package LC_April2024;

//  Number Of Students Unable To Eat Lunch -> https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
// TOPICS -> Array, Stack, Queue, Simulation.

public class Ap08 {
    public static void main(String[] args) {
        System.out.println(countStudents(new int[] {1,1,0,0},new int[] {1,0,1,0}));
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for (int student: students){
            count[student] ++;
        }
        for (int i = 0; i < sandwiches.length; i ++){
            if (count[sandwiches[i]] == 0){
                return sandwiches.length - i;
            }
            count[sandwiches[i]] --;
        }
        return 0;
    }
}
