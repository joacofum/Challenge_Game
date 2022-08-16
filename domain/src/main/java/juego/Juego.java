package juego;

import co.com.sofka.domain.generic.AggregateEvent;
import juego.values.JuegoId;

public class Juego extends AggregateEvent<JuegoId> {
    /**
     * Instantiates a new Aggregate event.
     *
     * @param entityId the entity id
     */
    public Juego(JuegoId entityId) {
        super(entityId);
    }
}
