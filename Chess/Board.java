// import com.sun.prism.paint.Color;
import java.awt.*;

public class Board {
    private Square[][] squares;

    public Board() {
        squares = new Square[8][8];

        for (int row = 0; row < squares.length; row++) {
            boolean isBlack = false;
            if (row % 2 == 0) {
                isBlack = true;
            }
            
            for (int col = 0; col < squares[row].length; col++) {
                int rank = squares.length - row;
                int file = col + 1;
                Color color = Color.WHITE;
                if (isBlack) {
                    color = Color.BLACK;
                }

                squares[row][col] = new Square(rank, file, color);
                isBlack = !isBlack;
                
            }
        }
    }

    public void printBoard() {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; row < 8; col++) {
                if(square.getColor() == Color.BLACK) {
                    System.out.println("[B]");
                } else {
                    System.out.println("[W]");
                }
                if(square.isHighlighted()) {
                    System.out.println("[H]");
                }
                if (square.getPiece() != null) {
                    System.out.println(square.getPiece);
                }
            }
        }
    }


    public Square getSquare(int rank, int file) {
        this.rank = rank;
        this.file = file;
    }
}