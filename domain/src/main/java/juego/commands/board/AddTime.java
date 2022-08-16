package juego.commands.board;

import co.com.sofka.domain.generic.Command;
import juego.values.TableroId;
import juego.values.Tiempo;

public class AddTime extends Command {
    private final TableroId tableroId;
    private final Tiempo time;

    public AddTime(TableroId tableroId, Tiempo time) {
        this.tableroId = tableroId;
        this.time = time;
    }

    public TableroId getTableroId() {
        return tableroId;
    }

    public Tiempo getTime() {
        return time;
    }
}
