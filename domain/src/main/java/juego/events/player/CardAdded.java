package juego.events.player;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.Carta;
import juego.values.JugadorId;

public class CardAdded extends DomainEvent {
    private final JugadorId jugadorId;
    private final Carta carta;

    public CardAdded(JugadorId jugadorId, Carta carta) {
        super("juego.events.player.cardadded");
        this.jugadorId = jugadorId;
        this.carta = carta;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Carta getCarta() {
        return carta;
    }
}
