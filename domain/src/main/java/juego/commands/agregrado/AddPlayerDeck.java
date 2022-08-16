package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.values.GameId;
import juego.values.PlayerId;
import juego.values.Mazo;

public class AddPlayerDeck extends Command {
    private final GameId gameId;
    private final PlayerId playerId;
    private final Mazo deck;

    public AddPlayerDeck(GameId gameId, PlayerId playerId, Mazo deck) {
        this.gameId = gameId;
        this.playerId = playerId;
        this.deck = deck;
    }

    public GameId getGameId() {
        return gameId;
    }

    public PlayerId getJugadorId() {
        return playerId;
    }

    public Mazo getDeck() {
        return deck;
    }
}
