package juego.events.agregado;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.PlayerId;
import juego.values.Mazo;

public class PlayerAdded extends DomainEvent {
    private final PlayerId playerId;
    private final String alias;
    private final String email;
    private final Integer puntos;
    private final Mazo mazo;

    public PlayerAdded(PlayerId playerId, String alias, String email, Integer puntos, Mazo mazo) {
        super("juego.playeradded");
        this.playerId = playerId;
        this.alias = alias;
        this.email = email;
        this.puntos = puntos;
        this.mazo = mazo;
    }

    public PlayerId getPlayerId() {
        return playerId;
    }

    public String getAlias() {
        return alias;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public Mazo getMazo() {
        return mazo;
    }
}
