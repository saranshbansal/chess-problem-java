package com.chess.problem.saransh.entities;

import com.chess.problem.saransh.Constants;
import com.chess.problem.saransh.Piece;

/**
 * Representation of a Rook piece.
 * 
 * A rook moves any number of vacant squares in an horizontal or vertical direction.
 *
 * @author sbansal
 *
 */
public class Rook extends Piece
{

    public Rook()
    {
        super(0, 0);
    }


    public Rook(int row, int col)
    {
        super(row, col);
    }


    @Override
    public Boolean isThreatening(Piece p)
    {

        // The piece is being threatened by the rook if the piece stays in the same row or the same column
        if (this.getRow() == p.getRow() // Horizontal
            || this.getCol() == p.getCol() // Vertical 
        )
            return new Boolean(true);

        return new Boolean(false);
    }


    @Override
    public String toString()
    {
        return Constants.ROOK;
    }

}
