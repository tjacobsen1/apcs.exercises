import java.awt.*;

public class ChessGame {
    private Board board;

    public ChessGame() {
        this.board = new Board();
    }

    public void placeRook(Board board, int rank, int file) {
        // board.clearBoard();
        board.getSquare(rank,file).setPiece("r");

        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                if (row == rank) {
                    board.getSquare(row, col).toggleHighlight();
                }
                
                if (col == file) {
                    board.getSquare(row, col).toggleHighlight();
                }
            }
        }
    }

    // public void placeBishop(int rank, int file) {
    //     // board.clearBoard();
    //     Square square = board.getSquare(rank, file);

    //     for (int row = 0; row < 8; row++) {
    //         if(board.getSquare(rank,file) != null) {
    //             board.getSquare(rank + 1,file).isHighlighted();
    //         }
    //     }
    //     for (int col = 0; col < 8; col++) {
    //         if(board.getSquare(rank, file) != null) {
    //             board.getSquare(rank, file + 1).isHighlighted();
    //         }
    //     }
    // }

    public static void main(String[] args) {
        Board board = new Board();
        ChessGame game = new ChessGame();

        game.placeRook(board, 1,2);
        System.out.println(board);
    }
}