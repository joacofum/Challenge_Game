package juego;

import co.com.sofka.domain.generic.AggregateEvent;
import juego.values.JuegoId;

public class Game extends AggregateEvent<JuegoId> {
    /**
     * Instantiates a new Aggregate event.
     *
     * @param entityId the entity id
     */
    public Game(JuegoId entityId) {
        super(entityId);
    }
}
