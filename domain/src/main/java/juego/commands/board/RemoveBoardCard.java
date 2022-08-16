package juego.commands.board;

import co.com.sofka.domain.generic.Command;
import juego.values.Carta;
import juego.values.Ronda;
import juego.values.TableroId;
import juego.values.Tiempo;

import java.util.Set;

public class RemoveBoardCard extends Command {
    private final TableroId boardId;
    private final Set<Carta> cartSetNew;
    private final Tiempo time;
    private final Ronda round;

    public RemoveBoardCard(TableroId boardId, Set<Carta> cartSet, Tiempo time, Ronda round) {
        this.boardId = boardId;
        this.cartSetNew = cartSet;
        this.time = time;
        this.round = round;
    }

    public TableroId getBoardId() {
        return boardId;
    }

    public Set<Carta> getCartSetNew() {
        return cartSetNew;
    }

    public Tiempo getTime() {
        return time;
    }

    public Ronda getRound() {
        return round;
    }
}
