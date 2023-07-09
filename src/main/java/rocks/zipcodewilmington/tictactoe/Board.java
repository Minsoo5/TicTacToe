package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    
    Character[][] board;
    
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        boolean tie = false;
        if(getWinner() == "") {
            tie = true;
        }
        return tie;
    }

    public String getWinner() {
        String winner = "";
        if (checkRowFor('X') == true || checkColumnFor('X') == true || checkDiag('X') == true) {
            winner = "X";
        } else if (checkRowFor('O') == true || checkColumnFor('O') == true || checkDiag('O') == true) {
            winner = "Y";
        } else winner = "";
        return winner;
    }


    public Boolean checkRowFor(char check) {
        //board[row][col]
        boolean didWin = false;
        if     ((board[0][0] == check && board[0][1] == check && board[0][2] == check) ||
                (board[1][0] == check && board[1][1] == check && board[1][2] == check) ||
                (board[2][0] == check && board[2][1] == check && board[2][2] == check)) {
            didWin = true;
        }
        return didWin;
        }


    public Boolean checkColumnFor(char check) {
        //board[row][col]
        boolean didWin = false;
        if     ((board[0][0] == check && board[1][0] == check && board[2][0] == check) ||
                (board[0][1] == check && board[1][1] == check && board[2][1] == check) ||
                (board[0][2] == check && board[1][2] == check && board[2][2] == check)) {
            didWin = true;
        }
        return didWin;
    }

    public Boolean checkDiag(char check) {
        boolean didWin = false;
        if ((board[0][0] == check && board[1][1] == check && board[2][2] == check)) {
            didWin = true;
        }

        return didWin;
    }

    public Boolean checkFavor(char check) {
        boolean inFavor = false;
        //check


      return null;
    }

}
