package juego.values;

import co.com.sofka.domain.generic.ValueObject;

public class Tiempo implements ValueObject<Integer> {
    private final Integer value;

    public Tiempo(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return this.value;
    }
}
