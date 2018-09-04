package com.chess.problem.saransh;

/**
 * Abstract class for all board pieces
 * 
 * @author sbansal
 *
 */
public interface IPiece
{

    /**
     * Checks if the piece p is being threatened by this piece.
     * 	
     * @param p
     *
     * @return True if the piece is threatened
     */
    abstract Boolean isThreatening(Piece p);

}
