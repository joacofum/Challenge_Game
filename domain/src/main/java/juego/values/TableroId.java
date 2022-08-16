package juego.values;

import co.com.sofka.domain.generic.Identity;

public class TableroId extends Identity {
    private TableroId(String id){ super(id); }

    public TableroId(){}

    public static TableroId of(String id) {
        return new TableroId(id);
    }
}
