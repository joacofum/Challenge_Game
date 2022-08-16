package juego.commands.board;

import co.com.sofka.domain.generic.Command;
import juego.values.Carta;
import juego.values.Ronda;
import juego.values.TableroId;
import juego.values.Tiempo;

import java.util.Set;

public class AddBoardCard extends Command {
    private final TableroId boardId;
    private final Set<Carta> cartSet;
    private final Tiempo time;
    private final Ronda round;

    public AddBoardCard(TableroId boardId, Set<Carta> cartSet, Tiempo time, Ronda round){
        this.boardId = boardId;
        this.cartSet = cartSet;
        this.time = time;
        this.round = round;
    }

    public TableroId getBoardId() {
        return boardId;
    }

    public Set<Carta> getCartSet() {
        return cartSet;
    }

    public Tiempo getTime() {
        return time;
    }

    public Ronda getRound() {
        return round;
    }
}
