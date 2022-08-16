package juego.commands.player;

import co.com.sofka.domain.generic.Command;
import juego.values.JuegoId;
import juego.values.JugadorId;
import juego.values.Mazo;

public class AddDeck extends Command {
    private final JuegoId juegoId;
    private final JugadorId jugadorId;
    private final Mazo mazo;

    public AddDeck(JuegoId juegoId, JugadorId jugadorId, Mazo mazo) {
        this.juegoId = juegoId;
        this.jugadorId = jugadorId;
        this.mazo = mazo;
    }

    public JuegoId getJuegoId() {
        return juegoId;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Mazo getMazo() {
        return mazo;
    }
}
