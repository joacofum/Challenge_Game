package juego.commands.board;

import co.com.sofka.domain.generic.Command;
import juego.values.Carta;
import juego.values.TableroId;

import java.util.Set;

public class AddCardDeck extends Command {
    private final TableroId bordId;
    private final Set<Carta> cartaSet;
    private final Carta card;

    public TableroId getBordId() {
        return bordId;
    }

    public Set<Carta> getCartaSet() {
        return cartaSet;
    }

    public Carta getCard() {
        return card;
    }

    public AddCardDeck(TableroId bordId, Set<Carta> cartaSet, Carta card) {
        this.bordId = bordId;
        this.cartaSet = cartaSet;
        this.card = card;
    }
}
