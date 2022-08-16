package juego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Set;

public class Ronda implements ValueObject<String> {
    private final Set<PlayerId> playerIdSet;
    private final Integer numero;
    private final EstadoRonda estadoRonda;

    public Ronda(Set<PlayerId> playerIdSet, Integer numero, EstadoRonda estadoRonda) {
        this.playerIdSet = playerIdSet;
        this.numero = numero;
        this.estadoRonda = estadoRonda;
    }

    @Override
    public String value() {
        return null;
    }
}
