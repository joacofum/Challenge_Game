package juego.commands.board;

import co.com.sofka.domain.generic.Command;
import juego.values.Ronda;
import juego.values.TableroId;

public class AddRound extends Command {
    private final TableroId tableroId ;
    private final Ronda round;

    public AddRound(TableroId tableroId, Ronda round) {
        this.tableroId = tableroId;
        this.round = round;
    }

    public TableroId getTableroId() {
        return tableroId;
    }

    public Ronda getRound() {
        return round;
    }
}
