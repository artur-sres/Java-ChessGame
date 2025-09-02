package chess;

import boardgame.Board;
import boardgame.Color;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{
    //Attributes
    Private Color color;

    //Constructor
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    //Getters
    public Color getColor() {
        return color;
    }
}
