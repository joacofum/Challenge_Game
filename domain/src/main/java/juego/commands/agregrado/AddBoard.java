package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.values.Carta;
import juego.values.GameId;
import juego.values.Ronda;
import juego.values.Tiempo;

import java.util.Set;

public class AddBoard extends Command {
    private final GameId gameId;
    private final Set<Carta> cartaSet;
    private final Tiempo tiempo;
    private final Ronda ronda;

    public AddBoard(GameId gameId, Set<Carta> cartaSet, Tiempo tiempo, Ronda ronda) {
        this.gameId = gameId;
        this.cartaSet = cartaSet;
        this.tiempo = tiempo;
        this.ronda = ronda;
    }

    public GameId getGameId() {
        return gameId;
    }

    public Set<Carta> getCartaSet() {
        return cartaSet;
    }

    public Tiempo getTiempo() {
        return tiempo;
    }

    public Ronda getRonda() {
        return ronda;
    }

}
