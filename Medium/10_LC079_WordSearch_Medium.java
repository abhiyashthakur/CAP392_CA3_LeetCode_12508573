class _10_LC079_WordSearch_Medium {
    public static boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                if (search(board, word, row, column, 0)) return true;
            }
        }
        return false;
    }

    private static boolean search(char[][] board, String word, int row, int column, int index) {
        if (index == word.length()) return true;
        if (row < 0 || row >= board.length || column < 0 || column >= board[0].length
                || board[row][column] != word.charAt(index)) return false;
        char saved = board[row][column];
        board[row][column] = '#';
        boolean found = search(board, word, row + 1, column, index + 1)
                || search(board, word, row - 1, column, index + 1)
                || search(board, word, row, column + 1, index + 1)
                || search(board, word, row, column - 1, index + 1);
        board[row][column] = saved;
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exist(board, "ABCCED"));
        System.out.println(!exist(board, "ABCB"));
    }
}
