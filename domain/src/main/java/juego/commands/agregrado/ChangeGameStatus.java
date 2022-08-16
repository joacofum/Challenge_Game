package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.values.EstadoJuego;
import juego.values.GameId;

public class ChangeGameStatus extends Command {
    private final GameId gameId;
    private final EstadoJuego estadoJuego;

    public ChangeGameStatus(GameId gameId, EstadoJuego estadoJuego) {
        this.gameId = gameId;
        this.estadoJuego = estadoJuego;
    }

    public GameId getGameId() {
        return gameId;
    }

    public EstadoJuego getEstadoJuego() {
        return estadoJuego;
    }
}
