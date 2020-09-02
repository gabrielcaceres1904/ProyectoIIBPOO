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
        super.vida = (int) Math.random()*(200-150+1)+150;
    }    
    
    @Override
    public int ataque(){
        int dañoCausado = (int)(Math.random()*(7-3+1)+3);
        return dañoCausado;
    }
    
    @Override
    public int ataqueEspecial(){
        int dañoCausado = (int)(Math.random()*(7-3+1)+3);
        return dañoCausado;
    }

    public int getVida() {
        return vida;
    }
     
}
