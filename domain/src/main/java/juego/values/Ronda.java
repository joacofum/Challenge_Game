package juego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Set;

public class Ronda implements ValueObject<String> {
    private final Set<JugadorId> jugadorIdSet;
    private final Integer numero;
    private final EstadoRonda estadoRonda;

    public Ronda(Set<JugadorId> jugadorIdSet, Integer numero, EstadoRonda estadoRonda) {
        this.jugadorIdSet = jugadorIdSet;
        this.numero = numero;
        this.estadoRonda = estadoRonda;
    }

    @Override
    public String value() {
        return null;
    }
}
