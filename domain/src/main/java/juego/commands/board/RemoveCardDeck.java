package juego.commands.board;

import co.com.sofka.domain.generic.Command;
import juego.values.Carta;
import juego.values.TableroId;

import java.util.Set;

public class RemoveCardDeck extends Command {
    private final TableroId bordId;
    private final Set<Carta> cartaSetNew;
    private final Carta card;

    public RemoveCardDeck(TableroId bordId, Set<Carta> cartaSetNew, Carta card) {
        this.bordId = bordId;
        this.cartaSetNew = cartaSetNew;
        this.card = card;
    }

    public TableroId getBordId() {
        return bordId;
    }

    public Set<Carta> getCartaSetNew() {
        return cartaSetNew;
    }

    public Carta getCard() {
        return card;
    }
}
