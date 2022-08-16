package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.values.GameId;
import juego.values.Winner;

public class AddWinner extends Command {
    private final GameId gameId;
    private final Winner winner;

    public AddWinner(GameId gameId, Winner winner) {
        this.gameId = gameId;
        this.winner = winner;
    }

    public GameId getGameId() {
        return gameId;
    }

    public Winner getWinner() {
        return winner;
    }
}
