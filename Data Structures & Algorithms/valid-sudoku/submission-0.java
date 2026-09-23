class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char value = board[i][j];

                if (value == '.') {
                    continue;
                }

                // Calculate which 3x3 square this cell belongs to
                int squareIndex = (i / 3) * 3 + (j / 3);

                // Check row
                if (rows[i].contains(value)) {
                    return false;
                }

                // Check column
                if (cols[j].contains(value)) {
                    return false;
                }

                // Check 3x3 square
                if (squares[squareIndex].contains(value)) {
                    return false;
                }

                // Add value to all three
                rows[i].add(value);
                cols[j].add(value);
                squares[squareIndex].add(value);
            }
        }

        return true;
    }
}

