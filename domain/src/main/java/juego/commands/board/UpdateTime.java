package juego.commands.board;

import co.com.sofka.domain.generic.Command;
import juego.values.TableroId;
import juego.values.Tiempo;

public class UpdateTime extends Command {
    private final TableroId tableroId;
    private final Tiempo timeNew;

    public UpdateTime(TableroId tableroId, Tiempo timeNew) {
        this.tableroId = tableroId;
        this.timeNew = timeNew;
    }

    public TableroId getTableroId() {
        return tableroId;
    }

    public Tiempo getTimeNew() {
        return timeNew;
    }
}
