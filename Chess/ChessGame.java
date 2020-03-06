public class ChessGame {
    private Board board;

    public ChessGame() {
        this.board = new Board();
    }

    public void placeRook(int rank, int file) {
        // board.clearBoard();
        Square square = board.getSquare(rank, file);

        for (int row = 0; row < board.length; row++) {
            board.getSquare(row, file).isHighlighted();
        }

        for (int col = 0; col < board.length; col++) {
            if (col == file) {
                board.getSquare(rank, col).isHighlighted();
            }
        }
    }

    public void placeBishop(int rank, int file) {
        // board.clearBoard();
        Square square = board.getSquare(rank, file);

        for (int row = 0; row < board.length; row++) {
            if(board.getSquare(rank,file) != null) {
                board.getSquare(row+1,file).isHighlighted();
            }
        }
        for (int col = 0; col < board.length; col++) {
            if(board.getSquare(rank, file) != null) {
                board.getSquare(row, file+1).isHighlighted();
            }
        }
    }

    
}