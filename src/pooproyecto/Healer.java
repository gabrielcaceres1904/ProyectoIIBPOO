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
public class Healer extends Heroe {
    
    public Healer(){
        this.vida=25;
        this.recurso=60;
        this.vidaMaxima=this.vida;
        this.recursoMaximo=this.recurso;
    }


    @Override
    int ataque() {
        return super.damage = (int) ((Math.random()*5)+1);
    }

    @Override
    int ataqueEspecial() {
        recurso -= 5;
        return super.damage = 10;
    }
    
}
