package juego;

import co.com.sofka.domain.generic.AggregateEvent;
import juego.entities.Jugador;
import juego.entities.Tablero;
import juego.values.EstadoJuego;
import juego.values.GameId;
import juego.values.Winner;

import java.util.Set;

public class Game extends AggregateEvent<GameId> {
    /**
     * Instantiates a new Aggregate event.
     *
     * @param entityId the entity id
     */
    protected Tablero tablero;
    protected Set<Jugador> jugadorSet;
    protected EstadoJuego estadoJuego;
    protected Winner winner;
    public Game(GameId entityId) {
        super(entityId);
    }

}
