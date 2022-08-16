package juego.commands.player;

import co.com.sofka.domain.generic.Command;
import juego.values.GameId;
import juego.values.PlayerId;
import juego.values.Mazo;

public class AddDeck extends Command {
    private final GameId gameId;
    private final PlayerId playerId;
    private final Mazo mazo;

    public AddDeck(GameId gameId, PlayerId playerId, Mazo mazo) {
        this.gameId = gameId;
        this.playerId = playerId;
        this.mazo = mazo;
    }

    public GameId getGameId() {
        return gameId;
    }

    public PlayerId getJugadorId() {
        return playerId;
    }

    public Mazo getMazo() {
        return mazo;
    }
}
