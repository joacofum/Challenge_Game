package juego.events.agregado;

import co.com.sofka.domain.generic.DomainEvent;
import juego.entities.Jugador;
import juego.values.GameStatus;
import juego.values.Winner;

import java.util.Set;

public class GameCreated extends DomainEvent {
    private final Set<Jugador> jugadorSet;
    private final GameStatus gameStatus;
    private final Winner winner;


    public GameCreated(Set<Jugador> jugadorSet, GameStatus gameStatus) {
        super("juego.gamecreated");
        this.jugadorSet = jugadorSet;
        this.gameStatus = gameStatus;
        this.winner = null;
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
