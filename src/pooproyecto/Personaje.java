/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproyecto;

/**
 *
 * @author tapia
 */
public abstract class Personaje {
    
    protected int vida;
    protected int damage;
    
    abstract int ataque();
    abstract int ataqueEspecial();
    public void recibirDaño(int daño){
        this.vida=vida-daño;
    }

    public int getVida() {
        return vida;
    }
    
}
