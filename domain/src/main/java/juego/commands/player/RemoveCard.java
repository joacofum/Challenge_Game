package juego.commands.player;

import co.com.sofka.domain.generic.Command;
import juego.values.Carta;
import juego.values.GameId;
import juego.values.PlayerId;

public class RemoveCard extends Command {
    private final GameId gameId;
    private final PlayerId playerId;
    private final Carta carta;

    public RemoveCard(GameId gameId, PlayerId playerId, Carta carta) {
        this.gameId = gameId;
        this.playerId = playerId;
        this.carta = carta;
    }

    public GameId getGameId() {
        return gameId;
    }

    public PlayerId getJugadorId() {
        return playerId;
    }

    public Carta getCarta() {
        return carta;
    }
}
