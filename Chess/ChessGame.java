import java.awt.*;

public class ChessGame {
    private Board board;

    public ChessGame() {
        this.board = new Board();
    }

    public void placeRook(Board board, int rank, int file) {
        // board.clearBoard();
        board.getSquare(rank,file).setPiece("r");
        int rookinfluence = 0;
        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                if (row == rank) {
                    board.getSquare(row, col).toggleHighlight();
                    rookinfluence++;
                }
                
                if (col == file) {
                    board.getSquare(row, col).toggleHighlight();
                    rookinfluence++;
                }
            }
        }
        rookinfluence-=2;
        System.out.println(rookinfluence);
    }

    public void placeBishop(Board board,int rank, int file) {
        // board.clearBoard();
        board.getSquare(rank,file).setPiece("b");
        int bishopinfluence = 0;
        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                int rankDist = Math.abs(rank - row);
                int fileDist =  Math.abs(file - col);
                if(rankDist == fileDist) {
                    board.getSquare(row,col).toggleHighlight();
                    bishopinfluence++;
                } 
            }
        }
        bishopinfluence-=1;
        System.out.println(bishopinfluence);
    }

    public void placeKnight(Board board, int rank, int file) {
        board.clearBoard();
        board.getSquare(rank,file).setPiece("k");
        int knightinfluence = 0;
        for(int row = 1; row <= 8; row++) {
            for(int col = 1; col <= 8; col++) {
                
            }
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        ChessGame game = new ChessGame();

        // game.placeRook(board, 1,2);
        game.placeBishop(board, 3,4);
        System.out.println(board);
    }
}