package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.values.GameStatus;
import juego.values.GameId;

public class ChangeGameStatus extends Command {
    private final GameId gameId;
    private final GameStatus gameStatus;

    public ChangeGameStatus(GameId gameId, GameStatus gameStatus) {
        this.gameId = gameId;
        this.gameStatus = gameStatus;
    }

    public GameId getGameId() {
        return gameId;
    }

    public GameStatus getEstadoJuego() {
        return gameStatus;
    }
}
