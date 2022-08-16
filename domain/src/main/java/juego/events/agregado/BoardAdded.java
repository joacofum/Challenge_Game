package juego.events.agregado;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.*;

import java.util.Set;

public class BoardAdded extends DomainEvent {
    private final TableroId tableroId;
    private final Set<Carta> cartaSet;
    private final Tiempo tiempo;
    private final Ronda ronda;

    public BoardAdded(TableroId tableroId, Set<Carta> cartaSet, Tiempo tiempo, Ronda ronda) {
        super("juego.boardadded");
        this.tableroId = tableroId;
        this.cartaSet = cartaSet;
        this.tiempo = tiempo;
        this.ronda = ronda;
    }

    public TableroId getTableroId() {
        return tableroId;
    }

    public Set<Carta> getCartaSet() {
        return cartaSet;
    }

    public Tiempo getTiempo() {
        return tiempo;
    }

    public Ronda getRonda() {
        return ronda;
    }
}
