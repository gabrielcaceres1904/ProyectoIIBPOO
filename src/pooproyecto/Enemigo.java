/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib_poo;

/**
 *
 * @author justi
 */
public abstract class Enemigo {
    private int vida;
    private int damage;
    private int turnoActual;
    
    public abstract int ataque();
    
    public abstract int ataqueEspecial();
}
