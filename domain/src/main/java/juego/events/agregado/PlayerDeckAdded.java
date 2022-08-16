package juego.events.agregado;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.PlayerId;
import juego.values.Mazo;

public class PlayerDeckAdded extends DomainEvent {
    private final PlayerId playerId;
    private final Mazo deck;

    public PlayerDeckAdded(PlayerId playerId, Mazo deck) {
        super("juego.playerdeckadded");
        this.playerId = playerId;
        this.deck = deck;
    }

    public PlayerId getJugadorId() {
        return playerId;
    }

    public Mazo getDeck() {
        return deck;
    }
}
