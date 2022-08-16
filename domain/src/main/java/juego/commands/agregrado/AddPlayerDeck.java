package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.values.GameId;
import juego.values.JugadorId;

public class AddPlayerDeck extends Command {
    private final GameId gameId;
    private final JugadorId jugadorId;

    public AddPlayerDeck(GameId gameId, JugadorId jugadorId) {
        this.gameId = gameId;
        this.jugadorId = jugadorId;
    }

    public GameId getGameId() {
        return gameId;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

}
