package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.values.GameId;
import juego.values.PlayerId;

public class UpdatePlayerScore extends Command {
    private final GameId gameId;
    private final PlayerId playerId;
    private final Integer puntos;


    public UpdatePlayerScore(GameId gameId, PlayerId playerId, Integer puntos) {
        this.gameId = gameId;
        this.playerId = playerId;
        this.puntos = puntos;
    }

    public GameId getGameId() {
        return gameId;
    }

    public PlayerId getJugadorId() {
        return playerId;
    }

    public Integer getPuntos() {
        return puntos;
    }
}
