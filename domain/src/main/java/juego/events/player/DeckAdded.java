package juego.events.player;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.JugadorId;
import juego.values.Mazo;

public class DeckAdded extends DomainEvent {
    private final JugadorId jugadorId;
    private final Mazo mazo;

    public DeckAdded(JugadorId jugadorId, Mazo mazo) {
        super("juego.events.player.deckadded");
        this.jugadorId = jugadorId;
        this.mazo = mazo;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Mazo getMazo() {
        return mazo;
    }
}
