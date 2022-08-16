package juego.commands.player;

import co.com.sofka.domain.generic.Command;
import juego.values.JuegoId;
import juego.values.JugadorId;

public class UpdateScore extends Command {
    private final JuegoId juegoId;
    private final JugadorId jugadorId;
    private final Integer score;

    public UpdateScore(JuegoId juegoId, JugadorId jugadorId, Integer score) {
        this.juegoId = juegoId;
        this.jugadorId = jugadorId;
        this.score = score;
    }

    public JuegoId getJuegoId() {
        return juegoId;
    }

    public JugadorId getJugadorId() {
        return jugadorId;
    }

    public Integer getScore() {
        return score;
    }
}
