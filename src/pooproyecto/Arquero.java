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
public class Arquero extends Heroe {
    
    public Arquero(){
        this.vida=30;
        this.recurso=30;
        this.vidaMaxima=this.vida;
        this.recursoMaximo=this.recurso;
    }
    

    @Override
    public int ataque() {
        recurso --;
        return super.damage = (int) ((Math.random()*10)+1);
    }

    @Override
    public int ataqueEspecial() {
        recurso -= 5;
        return super.damage = (int) ((Math.random()*25)+6);
    }
    
    
}
