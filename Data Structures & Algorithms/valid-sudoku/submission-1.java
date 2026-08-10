class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> column = new HashSet<>(); 
            for( int j = 0; j < 9; j++) {
                if (row.contains(board[j][i])) {
                    return false;
                } else if (board[j][i] != '.') {
                    row.add(board[j][i]);
                }

                if (column.contains(board[i][j])) {
                    return false;
                } else if (board[i][j] != '.'){
                    column.add(board[i][j]);
                }
            }
            Set<Character> square = new HashSet<>();
            for (int m = 0; m < 3; m++) {
                for (int n = 0; n < 3; n++) {
                    int x = (i / 3) * 3 + m;
                    int y = (i % 3) * 3 + n;
                    if (square.contains(board[x][y])) {
                        return false;
                    } else if (board[x][y] != '.'){
                        square.add(board[x][y]);
                    }
                }
            }
        }
        return true;
    }
}
