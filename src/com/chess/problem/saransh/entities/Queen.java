package com.chess.problem.saransh.entities;

import com.chess.problem.saransh.Constants;
import com.chess.problem.saransh.Piece;

/**
 * Representation of a Queen piece.
 * 
 * A Queen moves any number of vacant squares in a horizontal, vertical, or diagonal direction.
 * 
 * @author sbansal
 *
 */
public class Queen extends Piece
{

    public Queen()
    {
        super(0, 0);
    }


    public Queen(int row, int col)
    {
        super(row, col);
    }


    @Override
    public Boolean isThreatening(Piece p)
    {

        // The piece is being threatened by the Queen if the piece stays in any square in a horizontal, vertical, or diagonal direction.
        if (this.getRow() == p.getRow() // Horizontal
            || this.getCol() == p.getCol() // Vertical      
            || (Math.abs(this.getRow() - p.getRow()) == Math.abs(this.getCol() - p.getCol())) // Diagonal 
        )
            return new Boolean(true);

        return new Boolean(false);
    }


    @Override
    public String toString()
    {
        return Constants.QUEEN;
    }

}
