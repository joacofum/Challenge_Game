package juego.events.player;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.JugadorId;

public class ScoreUpdated extends DomainEvent {
    private final JugadorId jugadorId;
    private final Integer score;

    public ScoreUpdated(JugadorId jugadorId, Integer score) {
        super("juego.events.player.scoreupdated");
        this.jugadorId = jugadorId;
        this.score = score;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Integer getScore() {
        return score;
    }
}
