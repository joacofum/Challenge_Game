package juego.events.agregado;

import co.com.sofka.domain.generic.DomainEvent;
import juego.values.GameId;
import juego.values.Winner;

public class WinnerAdded extends DomainEvent {
    private final Winner winner;

    public WinnerAdded(Winner winner) {
        super("juego.winneradded");
        this.winner = winner;
    }

    public Winner getWinner() {
        return winner;
    }
}
