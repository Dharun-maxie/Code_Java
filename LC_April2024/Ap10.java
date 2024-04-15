package LC_April2024;

import java.util.*;

//  Reveal Cards In Increasing Order -> https://leetcode.com/problems/reveal-cards-in-increasing-order/
//  Topics -> Array, Queue, Sorting, Simulation.

import java.util.Arrays;

public class Ap10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deckRevealedIncreasing(new int[] {17,13,11,2,3,5,7})));
    }
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int n = deck.length;
        int[] result = new int[n];
        Deque<Integer> queue = new LinkedList<>();


        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }

        for (int card : deck) {

            result[queue.poll()] = card;

            if (!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
        }

        return result;
    }
}
