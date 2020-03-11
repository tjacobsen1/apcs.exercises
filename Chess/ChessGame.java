import java.awt.*;

public class ChessGame {
    private Board board;

    public ChessGame() {
        this.board = new Board();
    }

    public void placeRook(int rank, int file) {
        // board.clearBoard();
        board.getSquare(rank,file).setPiece("r");
        int rookinfluence = 0;
        for (int row = 1; row <= board.getWidth(); row++) {
            for (int col = 1; col <= board.getLength(); col++) {
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

    public void placeBishop(int rank, int file) {
        // board.clearBoard();
        board.getSquare(rank,file).setPiece("b");
        int bishopinfluence = 0;
        for (int row = 1; row <= board.getWidth(); row++) {
            for (int col = 1; col <= board.getLength(); col++) {
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

    public void placeKnight(int rank, int file) {
        // board.clearBoard();
        board.getSquare(rank,file).setPiece("k");
        int knightinfluence = 0;
        for(int row = 1; row <= board.getWidth(); row++) {
            for(int col = 1; col <= board.getLength(); col++) {
                if(row!= rank && col!= file && Math.abs(row-rank) + Math.abs(col-file) ==3) {
                    board.getSquare(row,col).toggleHighlight();
                    knightinfluence++;
                }
            }
        }
        System.out.println(knightinfluence);
    }

    public void placeQueen(int rank, int file) {
        board.getSquare(rank,file).setPiece("q");
        int queeninfluence = 0;
        for (int row = 1; row <= board.getWidth(); row++) {
            for (int col = 1; col <= board.getLength(); col++) {
                int rankDist = Math.abs(rank - row);
                int fileDist =  Math.abs(file - col);
                if(rankDist == fileDist) {
                    board.getSquare(row,col).toggleHighlight();
                    queeninfluence++;
                }
            }
        }
        for (int row = 1; row <= board.getWidth(); row++) {
            for (int col = 1; col <= board.getLength(); col++) {
                if (row == rank) {
                    board.getSquare(row, col).toggleHighlight();
                    queeninfluence++;
                }
                
                if (col == file) {
                    board.getSquare(row, col).toggleHighlight();
                    queeninfluence++;
                }
            }
        }
        queeninfluence-=2;
        System.out.println(queeninfluence);
    }


    public String toString() {
        return board.toString();
    }
    public static void main(String[] args) {
        ChessGame game = new ChessGame();

        // game.placeRook(1,2);
        // game.placeBishop(3,4);
        // game.placeKnight(3, 5);
        game.placeQueen(5,5);
        System.out.println(game);
    }
}