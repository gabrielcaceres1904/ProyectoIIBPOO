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
public class Guerrero extends Heroe{
    
    public Guerrero(){
        this.vida=40;
        this.recurso=50;
        this.vidaMaxima=this.vida;
        this.recursoMaximo=this.recurso;
    }
    

    @Override
    public int ataque() {
        recurso -= 10;
        return super.damage = (int) ((Math.random()*15)+3);
    }

    @Override
    public int ataqueEspecial() {
        recurso -= 20; 
        return super.damage = (int) ((Math.random()*30)+7);
    }
    
}
