package LC_April2024;

//  Time Needed To Buy Tickets -> https://leetcode.com/problems/time-needed-to-buy-tickets/
//  Topics -> Strings, Queue, Simulation.

public class Ap09 {
    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[] {84,49,5,24,70,77,87,8}, 3)); // output: 154
//        System.out.println(timeRequiredToBuy(new int[] {5,1,1,1}, 0)); // output: 8
//        System.out.println(timeRequiredToBuy(new int[] {2,3,2}, 2)); // output: 6
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        if(tickets.length == 0 || k > tickets.length)
            return 0;

        int timeTaken=0;
        int kthElement = tickets[k];
        for (int i = 0; i <= kthElement; i++) {
            for (int j = 0; j < tickets.length; j++) {
                if(tickets[k] == 0)
                    return timeTaken;
                else if(tickets[j] > 0) {
                    tickets[j]--;
                    timeTaken++;
                }
            }
            System.out.println(STR. "\{i} -> \{timeTaken}");
        }

        return timeTaken;
    }
}
