package com.chess.problem.saransh.entities;

import com.chess.problem.saransh.Constants;
import com.chess.problem.saransh.Piece;

/**
 * Representation of a Bishop piece.
 * 
 * A Bishop moves any number of vacant squares in any diagonal direction.
 * 
 * @author sbansal
 *
 */
public class Bishop extends Piece
{

    public Bishop()
    {
        super(0, 0);
    }


    public Bishop(int row, int col)
    {
        super(row, col);
    }


    @Override
    public Boolean isThreatening(Piece p)
    {

        // The piece is being threatened by the Bishop if the piece stays in any square in a diagonal direction.
        if (Math.abs(this.getRow() - p.getRow()) == Math.abs(this.getCol() - p.getCol()))
            return new Boolean(true);

        return new Boolean(false);
    }


    @Override
    public String toString()
    {
        return Constants.BISHOP;
    }

}
