package juego.events.agregado;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.PlayerId;

public class PlayerScoreUpdated extends DomainEvent {
    private final PlayerId playerId;
    private final Integer puntos;


    public PlayerScoreUpdated(PlayerId playerId, Integer puntos) {
        super("juego.playerscoreupdated")
        this.playerId = playerId;
        this.puntos = puntos;
    }

    public PlayerId getJugadorId() {
        return playerId;
    }

    public Integer getPuntos() {
        return puntos;
    }
}
