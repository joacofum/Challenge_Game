package juego.commands.player;

import co.com.sofka.domain.generic.Command;
import juego.values.Carta;
import juego.values.JuegoId;
import juego.values.JugadorId;

public class RemoveCard extends Command {
    private final JuegoId juegoId;
    private final JugadorId jugadorId;
    private Carta carta;

    public RemoveCard(JuegoId juegoId, JugadorId jugadorId, Carta carta) {
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
