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
    
    public Square getSquare(int rank, int file) {
        int row = squares.length - rank;
        int col = file - 1;
        return squares[row][col];
    }

    public String toString() {
        String output = "";
        String middle = "";
        for(int row = 0; row < squares.length; row++) {
            for(int col = 0; col < squares[row].length; col++) {
                output+="[";
                if(squares[row][col].getColor() == Color.BLACK) {
                    middle = "B";
                }
                if (squares[row][col].getColor() != Color.BLACK) {
                    middle = "W";
                }
                if(squares[row][col].isHighlighted()) {
                    middle = "H";
                }
                if (squares[row][col].getPiece() != null) {
                    middle = squares[row][col].getPiece();
                }
                output+=middle;
                output+="]" + " ";
            }
            output+="\n";
        }
        return output;
    }
}