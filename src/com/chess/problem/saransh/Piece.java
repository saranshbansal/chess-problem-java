package com.chess.problem.saransh;

import java.util.Iterator;

import com.chess.problem.saransh.entities.Board;

/**
 * Abstract class for all board's pieces
 * 
 * @author sbansal
 *
 */
public abstract class Piece implements IPiece
{

    // Position inside the row
    private int row;

    // Position inside the column
    private int col;


    public Piece(int row, int col)
    {
        super();
        this.row = row;
        this.col = col;
    }


    public int getCol()
    {
        return col;
    }


    public int getRow()
    {
        return row;
    }


    /**
     * One piece is safe in the board, if the new piece is not threatened by any piece in the board,
     * and the new piece doesn't attack the other pieces in the board.
     * 
     * @param board
     * @return
     */
    public boolean isSafe(Board board)
    {

        boolean isSafe = true;

        for (Iterator<Piece> iterator = board.getPieces().iterator(); iterator.hasNext();)
        {
            Piece pieceAux = iterator.next();
            isSafe &= !isThreatened(this, pieceAux);
        }

        return isSafe;

    }


    /**
     * Two pieces are threatened if one attacks the other or vice-versa
     * 
     * @param piece1
     * @param piece2
     * @return True if one of the pieces is threatened.
     */
    private boolean isThreatened(Piece piece1, Piece piece2)
    {
        return (piece1.isThreatening(piece2) || piece2.isThreatening(piece1));

    }


    public void setCol(int col)
    {
        this.col = col;
    }


    public void setRow(int row)
    {
        this.row = row;
    }

}
