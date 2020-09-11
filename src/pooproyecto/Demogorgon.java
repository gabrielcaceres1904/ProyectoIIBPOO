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
public class Demogorgon extends Enemigo{
    
    
    public Demogorgon(){
        this.vida = (int) (Math.random()*(200-150+1)+150);
        this.nombre="Demogorgon";
        this.vidaMaxima=this.vida;
    }    
    
    @Override
    public int ataque(){
        this.damage = (int)(Math.random()*(7-3+1)+3);
        return damage;
    }
    
    @Override
    public int ataqueEspecial(){
        this.damage = (int)(Math.random()*(7-3+1)+3);
        this.damage=this.damage+(int)(Math.random()*(7-3+1)+3);
        return this.damage;
    }

    public int getVida() {
        return vida;
    }
     
}
