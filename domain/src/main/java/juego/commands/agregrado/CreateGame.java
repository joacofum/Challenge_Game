package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.entities.Jugador;
import juego.values.EstadoJuego;
import juego.values.GameId;
import juego.values.Winner;

import java.util.Set;

public class CreateGame extends Command {
    private final GameId gameId;
    private final Set<Jugador> jugadorSet;
    private final EstadoJuego estadoJuego;
    private final Winner winner;


    public CreateGame(GameId gameId, Set<Jugador> jugadorSet, EstadoJuego estadoJuego) {
        this.gameId = gameId;
        this.jugadorSet = jugadorSet;
        this.estadoJuego = estadoJuego;
        this.winner = null;
    }

    public GameId getGameId() {
        return gameId;
    }

    public Set<Jugador> getJugadorSet() {
        return jugadorSet;
    }

    public EstadoJuego getEstadoJuego() {
        return estadoJuego;
    }

    public Winner getWinner() {
        return winner;
    }
}
