package chess;

import boardgame.Board;
import boardgame.Color;

public class Roock extends ChessPiece{
    public Roock(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
