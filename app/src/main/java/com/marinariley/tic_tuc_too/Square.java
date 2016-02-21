package com.marinariley.tic_tuc_too;

/**
 * Created by rileygoldman&marina on 2/20/16.
 */
public class Square {

    private char won = '\0';
    private char board[][] = new char[3][3];

    public Square()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = '\0';
            }
        }
    }

    public char whoWins()
    {
        return won;
    }

    public boolean move(char player, int x, int y)
    {
        if (board[x][y] != '\0')
        {
            board[x][y] = player;
            won = checkWin(x, y);
            return true;
        }
        return false;
    }

    private char checkWin(int x, int y)
    {
        if (board[x][0] == board[x][1] && board[x][0] == board[x][2])
            return board[x][y];
        else if (board[0][y] == board[1][y] && board[0][y] == board[2][y])
            return board[x][y];
        else if (board[0][0] == board[1][1] && board[2][2] == board[0][0])
            return board[0][0];
        else if (board[0][2] == board[1][1] && board[2][0] == board[1][1])
            return board[1][1];
        else
            return '\0';
    }
}
