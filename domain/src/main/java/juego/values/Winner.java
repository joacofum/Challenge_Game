package juego.values;

import co.com.sofka.domain.generic.ValueObject;

public class Winner implements ValueObject<String> {
    private final String name;

    public Winner(String name) {
        this.name = name;
    }


    @Override
    public String value() {
        return this.name;
    }
}
