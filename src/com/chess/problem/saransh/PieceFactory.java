package com.chess.problem.saransh;

import com.chess.problem.saransh.entities.Bishop;
import com.chess.problem.saransh.entities.King;
import com.chess.problem.saransh.entities.Knight;
import com.chess.problem.saransh.entities.Queen;
import com.chess.problem.saransh.entities.Rook;

/**
 * Factory pattern 
 * 
 * @author sbansal
 *
 */
public class PieceFactory
{

    /**
     * Get an object of type piece in the default position [0,0]
     * 
     * @param pieceType
     * @return
     */
    public Piece getPiece(String pieceType)
    {
        if (Constants.KING.equals(pieceType))
        {
            return new King();
        }
        else if (Constants.ROOK.equals(pieceType))
        {
            return new Rook();
        }
        if (Constants.KNIGHT.equals(pieceType))
        {
            return new Knight();
        }
        else if (Constants.QUEEN.equals(pieceType))
        {
            return new Queen();
        }
        else if (Constants.BISHOP.equals(pieceType))
        {
            return new Bishop();
        }
        else
            return null;
    }


    /**
     * Get an object of type piece in the default position  
     *   
     * @param pieceType
     * @param row
     * @param col
     * @return
     */
    public Piece getPiece(String pieceType, int row, int col)
    {
        if (Constants.KING.equals(pieceType))
        {
            return new King(row, col);
        }
        else if (Constants.ROOK.equals(pieceType))
        {
            return new Rook(row, col);
        }
        if (Constants.KNIGHT.equals(pieceType))
        {
            return new Knight(row, col);
        }
        else if (Constants.QUEEN.equals(pieceType))
        {
            return new Queen(row, col);
        }
        else if (Constants.BISHOP.equals(pieceType))
        {
            return new Bishop(row, col);
        }
        else
            return null;

    }

}
