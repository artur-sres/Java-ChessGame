package boardgame;

public class Board {
    //Attributes
    private int rows;
    private int columns;
    private Piece[][] pieces;

    //Constructor
    private Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    //Getters
    public int getRows() {return rows;}
    public int getColumns() {return columns;}

    //methods =======================================================================
    //Check the piece in the position
    public Piece piece(Position position) { 
        if (!positionExists(position)) {
            throw new BoardException("Posição inválida");
        }
        return pieces[position.getRow()][position.getColumn()];
    }
    
    //Checks if the position exists
    public boolean positionExists(Position position) { 
        return positionExists(position.getRow(), position.getColumn());
    }
    private boolean positionExists(int row, int column) { 
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    //Places a piece on the board
    public void placePiece(Piece piece, Position position) {
        if(!thereisAPiece(position)) {
            throw new BoardException("Ja existe uma peça na posição " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    //Checks if there is already a piece on the position
    public boolean thereisAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Posição inválida");
        }
        return piece(position) != null;
    }
}
