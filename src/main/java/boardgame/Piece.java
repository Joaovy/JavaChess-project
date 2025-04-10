package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // por padrão o java já joga o valor nulo
    }

    protected Board getBoard() {
        return board;
    }


}
