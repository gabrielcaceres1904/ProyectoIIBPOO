/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproyecto;

/**
 *
 * @author justi
 */
public abstract class Enemigo extends Personaje{

    protected String nombre;
    
    protected abstract int ataque();
    
    protected abstract int ataqueEspecial();

    public String getNombre() {
        return nombre;
    }
    
    
}
