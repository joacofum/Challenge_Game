package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.entities.Jugador;
import juego.values.GameStatus;
import juego.values.GameId;
import juego.values.Winner;

import java.util.Set;

public class CreateGame extends Command {
    private final GameId gameId;
    private final Set<Jugador> jugadorSet;
    private final GameStatus gameStatus;
    private final Winner winner;


    public CreateGame(GameId gameId, Set<Jugador> jugadorSet, GameStatus gameStatus) {
        this.gameId = gameId;
        this.jugadorSet = jugadorSet;
        this.gameStatus = gameStatus;
        this.winner = null;
    }

    public GameId getGameId() {
        return gameId;
    }

    public Set<Jugador> getJugadorSet() {
        return jugadorSet;
    }

    public GameStatus getEstadoJuego() {
        return gameStatus;
    }

    public Winner getWinner() {
        return winner;
    }
}
