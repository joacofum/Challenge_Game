package juego.commands.agregrado;

import co.com.sofka.domain.generic.Command;
import juego.values.GameId;
import juego.values.Mazo;

public class AddPlayer extends Command {
    private final GameId gameId;
    private final String alias;
    private final String email;
    private final Integer puntos;
    private final Mazo mazo;

    public AddPlayer(GameId gameId, String alias, String email, Integer puntos, Mazo mazo) {
        this.gameId = gameId;
        this.alias = alias;
        this.email = email;
        this.puntos = puntos;
        this.mazo = mazo;
    }

    public GameId getGameId() {
        return gameId;
    }

    public String getAlias() {
        return alias;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public Mazo getMazo() {
        return mazo;
    }
}
