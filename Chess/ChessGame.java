import java.awt.*;

public class ChessGame {
    private Board board;

    public ChessGame() {
        this.board = new Board();
    }

    public void placeRook(int rank, int file) {
        // board.clearBoard();
        Square square = board.getSquare(rank, file);

        for (int row = 0; row < 8; row++) {
            board.getSquare(row, file).isHighlighted();
        }

        for (int col = 0; col < 8; col++) {
            if (col == file) {
                board.getSquare(rank, col).isHighlighted();
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

    
}