package juego.values;

import co.com.sofka.domain.generic.ValueObject;

public class Carta implements ValueObject<String>{

    private final Integer power;
    private final String description;
    private final boolean isEnabled;

    private final CartaMaestraId cartaMaestraId;


    public Carta(Integer power, String description, boolean isEnabled, CartaMaestraId cartaMaestraId) {
        this.power = power;
        this.description = description;
        this.isEnabled = isEnabled;
        this.cartaMaestraId = cartaMaestraId;
    }

    @Override
    public String value() {
        return null;
    }
}
