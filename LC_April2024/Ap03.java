package LC_April2024;

//  Word Search -> [https://leetcode.com/problems/word-search/]
//  TOPICS -> Backtracking, String, Array, Matrix.

public class Ap03 {
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(helper(board, i, j, word,0))
                    System.out.println("PATH IS EXIST!!!");
            }
        }
    }
    private static boolean helper(char[][] board,int r,int c,String ans,int level) {
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != ans.charAt(level))
            return false;
        if(level == ans.length()-1)
            return true;
        char temp = board[r][c];
        board[r][c] = '@';

        boolean founded = (
                            helper(board, r+1, c, ans, level+1)||
                            helper(board, r, c+1, ans, level+1)||
                            helper(board, r-1, c, ans, level+1)||
                            helper(board, r, c-1, ans, level+1)
        );
        board[r][c] = temp;

        return founded;
    }
}
