package juego.entities;

import co.com.sofka.domain.generic.Entity;
import juego.values.Carta;
import juego.values.Ronda;
import juego.values.TableroId;
import juego.values.Tiempo;

import java.util.Set;

public class Tablero extends Entity<TableroId> {
    /**
     * Instantiates a new Entity.
     *
     * @param entityId the entity id
     */

    protected Set<Carta> cartaSet;
    protected Tiempo tiempo;
    protected Ronda ronda;

    public Tablero(TableroId entityId) {
        super(entityId);
    }

    public Tablero(TableroId entityId, Set<Carta> cartaSet, Tiempo tiempo, Ronda ronda) {
        super(entityId);
        this.cartaSet = cartaSet;
        this.tiempo = tiempo;
        this.ronda = ronda;
    }

    //Funciones de Tablero.
}
