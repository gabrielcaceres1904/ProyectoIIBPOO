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
public class Mago extends Heroe {
    
    public Mago(){
        this.vida=20;
        this.recurso=40;
        this.vidaMaxima=this.vida;
        this.recursoMaximo=this.recurso;
    }
    
    @Override
    public int ataque() {
        return super.damage = (int) ((Math.random()*15)+1);
    }

    @Override
    public int ataqueEspecial() {
        recurso -= 10;
        return super.damage = (int) ((Math.random()*30)+5);
    }
    
}
