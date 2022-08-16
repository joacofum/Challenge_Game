package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.values.GameId;
import juego.values.JugadorId;

public class UpdatePlayerScore extends Command {
    private final GameId gameId;
    private final JugadorId jugadorId;
    private final Integer puntos;


    public UpdatePlayerScore(GameId gameId, JugadorId jugadorId, Integer puntos) {
        this.gameId = gameId;
        this.jugadorId = jugadorId;
        this.puntos = puntos;
    }

    public GameId getGameId() {
        return gameId;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Integer getPuntos() {
        return puntos;
    }
}
