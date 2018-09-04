package com.chess.problem.saransh.entities;

import java.util.ArrayList;
import java.util.Iterator;

import com.chess.problem.saransh.Constants;
import com.chess.problem.saransh.Piece;

/**
 * Representation of a chess board.
 * 
 * columns == Number of columns
 * rows == Number of rows
 * board == Board's positions 
 * 
 * @author sbansal
 *
 */
public class Board
{

    /** Number of columns */
    private int columns;

    /** Number of rows */
    private int rows;

    /** Board's positions */
    private Piece[][] board;

    /** Board's pieces */
    private ArrayList<Piece> pieces;

    /** Board's remaining pieces */
    private ArrayList<String> remainingPieces;

    public Board(int rows, int columns)
    {
        super();
        this.columns = columns;
        this.rows = rows;
        this.board = new Piece[this.rows][this.columns];
        this.pieces = new ArrayList<Piece>();
        this.remainingPieces = new ArrayList<String>();
    }


    /**
     * Add a piece to the board
     */
    public void addPiece(Piece piece)
    {
        this.board[piece.getRow()][piece.getCol()] = piece;
        this.pieces.add(0, piece);
    }


    /**
     * @return the board
     */
    public Piece[][] getBoard()
    {
        return board;
    }


    /**
     * @return the columns
     */
    public int getColumns()
    {
        return columns;
    }


    /**
     * @return the pieces
     */
    public ArrayList<Piece> getPieces()
    {
        return pieces;
    }


    /**
     * @return the remainingPieces
     */
    public ArrayList<String> getRemainingPieces()
    {
        return remainingPieces;
    }


    /**
     * @return the rows
     */
    public int getRows()
    {
        return rows;
    }


    /**
     * Print the board
     */
    public void printBoard()
    {

        for (int row = 0; row < this.rows; row++)
        {
            for (int col = 0; col < this.columns; col++)
            {
                System.out.print((this.board[row][col] == null) ? Constants.EMPTY + " " : this.board[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }


    /**
     * Remove a piece from the board
     */
    public void removePiece(Piece pieceOut)
    {
        this.board[pieceOut.getRow()][pieceOut.getCol()] = null;

        Iterator<Piece> itr = pieces.iterator();
        while (itr.hasNext())
        {
            Piece pieceIn = itr.next();
            if (pieceIn.equals(pieceOut))
            {
                itr.remove();
                break;
            }
        }

    }


    /**
     * @param board the board to set
     */
    public void setBoard(Piece[][] board)
    {
        this.board = board;
    }


    /**
     * @param columns the columns to set
     */
    public void setColumns(int columns)
    {
        this.columns = columns;
    }


    /**
     * @param pieces the pieces to set
     */
    public void setPieces(ArrayList<Piece> pieces)
    {
        this.pieces = pieces;
    }


    /**
     * @param remainingPieces the remainingPieces to set
     */
    public void setRemainingPieces(ArrayList<String> remainingPieces)
    {
        this.remainingPieces = remainingPieces;
    }


    /**
     * @param rows the rows to set
     */
    public void setRows(int rows)
    {
        this.rows = rows;
    }


    @Override
    public String toString()
    {
        String result = "";

        for (int row = 0; row < this.rows; row++)
        {
            for (int col = 0; col < this.columns; col++)
            {
                result += (this.board[row][col] == null) ? Constants.EMPTY + " " : this.board[row][col] + " ";
            }
            result += "\n";
        }

        return result;
    }

}
