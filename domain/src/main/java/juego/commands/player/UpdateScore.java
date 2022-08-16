package juego.commands.player;

import co.com.sofka.domain.generic.Command;
import juego.values.GameId;
import juego.values.PlayerId;

public class UpdateScore extends Command {
    private final GameId gameId;
    private final PlayerId playerId;
    private final Integer score;

    public UpdateScore(GameId gameId, PlayerId playerId, Integer score) {
        this.gameId = gameId;
        this.playerId = playerId;
        this.score = score;
    }

    public GameId getGameId() {
        return gameId;
    }

    public PlayerId getJugadorId() {
        return playerId;
    }

    public Integer getScore() {
        return score;
    }
}
