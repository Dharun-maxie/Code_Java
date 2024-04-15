package CQ_L1.Recursion;

import java.util.LinkedList;
import java.util.Queue;


public class TreeOnFire {
    public static void main(String[] args) {

        char[][] map={
                {'T','T','T','W','T'},
                {'W','T','T','T','T'},
                {'T','T','T','T','T'},
                {'T','T','T','T','W'},
                {'T','W','T','T','T'}
//                {'W','T','T'},
//                {'T','W','W'},
//                {'W','T','T'}
//                {'W','T','T'},
//                {'W','W','T'},
//                {'W','T','T'}

        };

        System.out.println(MinToProne(map,4,4,map.length,map.length));

    }
    public static int MinToProne(char[][] map, int r, int c, int m, int n)
    {
        boolean[][] visited = new boolean[m][n];

        Queue<int[]> queue = new LinkedList<>();
        int ans=0;
        visited[r][c] = true;
        queue.offer(new int[]{r,c,0});
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int x= queue.peek()[0], y= queue.peek()[1], Min=queue.peek()[2];
                queue.poll();
                ans = Math.max(ans, Min);

                for (int j = -1; j <=1 ; j++) {
                    for (int k = -1; k <=1 ; k++) {
                        if(j==0 && k==0)
                            continue;
                        int newR=x+j;
                        int newC=y+k;
                        if(isValid(m,n,newR, newC) && !visited[newR][newC] && map[newR][newC] != 'W') {
                            visited[newR][newC] = true;
                            queue.offer(new int[] {newR, newC, Min+1});
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static boolean isValid(int m,int n,int r,int c) {
        return (m > r && r >= 0 && c >= 0 && n > c);
    }
}

