package juego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Set;

public class Mazo implements ValueObject<String> {
    private final Set<Carta> cartasSet;

    public Mazo(Set<Carta> cartasSet) {
        this.cartasSet = cartasSet;
    }

    @Override
    public String value() {
        return null;
    }
}
