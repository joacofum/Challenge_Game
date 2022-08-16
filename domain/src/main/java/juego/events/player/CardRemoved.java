package juego.events.player;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.Carta;
import juego.values.JugadorId;

public class CardRemoved extends DomainEvent {
    private final JugadorId jugadorId;
    private final Carta carta;

    public CardRemoved(JugadorId jugadorId, Carta carta) {
        super("juego.events.player.cardremoved");
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
