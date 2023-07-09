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
        boolean truth = false;

        if (getWinner() == "") {
             if (checkFavor('X')) {
                 truth = true;
             } else {
                 truth = false;
             }

        } else if (getWinner() == "X") {
            truth = true;
        }

        return truth;
    }

    public Boolean isInFavorOfO() {
        boolean truth = false;

        if (getWinner() == "") {
            if (checkFavor('O')) {
                truth = true;
            } else {
                truth = false;
            }

        } else if (getWinner() == "O") {
            truth = true;
        }

        return truth;
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
            winner = "O";
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
        if ((board[0][0] == check && board[1][1] == check && board[2][2] == check) ||
            (board[0][2] == check && board[1][1] == check && board[2][0] == check)) {
            didWin = true;
        }

        return didWin;
    }

    public Boolean checkFavor(char check) {
        boolean inFavor = false;
        //check if empty space is surrounded by check or followed by two char

        if     ((board[0][0] ==  ' '  && board[1][0] == check && board[2][0] == check) ||
                (board[0][0] == check && board[1][0] ==  ' '  && board[2][0] == check) ||
                (board[0][0] == check && board[1][0] == check && board[2][0] ==  ' ' ) ||
                (board[0][1] ==  ' '  && board[1][1] == check && board[2][1] == check) ||
                (board[0][1] == check && board[1][1] ==  ' '  && board[2][1] == check) ||
                (board[0][1] == check && board[1][1] == check && board[2][1] ==  ' ' ) ||
                (board[0][2] ==  ' '  && board[1][2] == check && board[2][2] == check) ||
                (board[0][2] == check && board[1][2] ==  ' '  && board[2][2] == check) ||
                (board[0][2] == check && board[1][2] == check && board[2][2] ==  ' ' )) {
            inFavor = true;

        } else if ((board[0][0] ==  ' '  && board[0][1] == check && board[0][2] == check) ||
                   (board[0][0] == check && board[0][1] ==  ' '  && board[0][2] == check) ||
                   (board[0][0] == check && board[0][1] == check && board[0][2] ==  ' ' ) ||
                   (board[1][0] ==  ' '  && board[1][1] == check && board[1][2] == check) ||
                   (board[1][0] == check && board[1][1] ==  ' '  && board[1][2] == check) ||
                   (board[1][0] ==  ' '  && board[1][1] == check && board[1][2] ==  ' ' ) ||
                   (board[2][0] == check && board[2][1] ==  ' '  && board[2][2] == check) ||
                   (board[2][0] == check && board[2][1] == check && board[2][2] ==  ' ' )) {
            inFavor = true;

        } else if   ((board[0][0] ==  ' '  && board[1][1] == check && board[2][2] == check) ||
                     (board[0][0] == check && board[1][1] ==  ' '  && board[2][2] == check) ||
                     (board[0][0] == check && board[1][1] == check && board[2][2] ==  ' ' )) {
            inFavor = true;

        } else inFavor = false;

        return inFavor;
    }

}
