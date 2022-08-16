package juego.entities;


import co.com.sofka.domain.generic.Entity;
import juego.values.PlayerId;
import juego.values.Mazo;
import juego.values.UsuarioId;

public class Jugador extends Entity<PlayerId> {
    /**
     * Instantiates a new Entity.
     *
     * @param entityId the entity id
     */

    protected String alias;
    protected String email;
    protected Integer puntos;
    protected Mazo mazo;
    protected UsuarioId usuarioId;


    public Jugador(PlayerId entityId) {
        super(entityId);
    }

    public Jugador(PlayerId entityId, String alias, String email, Integer puntos, Mazo mazo, UsuarioId usuarioId) {
        super(entityId);
        this.alias = alias;
        this.email = email;
        this.puntos = puntos;
        this.mazo = mazo;
        this.usuarioId = usuarioId;
    }

    //Funciones de Jugador.


}
