package juego.events.agregado;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.GameStatus;

public class GameStatusChanged extends DomainEvent {
    private final GameStatus gameStatus;

    public GameStatusChanged(GameStatus gameStatus) {
        super("juego.gamestatuschanged");
        this.gameStatus = gameStatus;
    }

    public GameStatus getEstadoJuego() {
        return gameStatus;
    }
}
