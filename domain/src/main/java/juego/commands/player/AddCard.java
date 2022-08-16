package juego.commands.player;

import co.com.sofka.domain.generic.Command;
import juego.values.Carta;
import juego.values.JuegoId;
import juego.values.JugadorId;

public class AddCard extends Command {
    private final JuegoId juegoId;
    private final JugadorId jugadorId;
    private final Carta carta;

    public AddCard(JuegoId juegoId, JugadorId jugadorId, Carta carta) {
        this.juegoId = juegoId;
        this.jugadorId = jugadorId;
        this.carta = carta;
    }

    public JuegoId getJuegoId() {
        return juegoId;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Carta getCarta() {
        return carta;
    }
}
