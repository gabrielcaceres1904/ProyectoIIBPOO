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
public class Hydra extends Enemigo{
    private int vida = (int) Math.random()*(400-300+1)+300;
    
    
    @Override
    public int ataque(){
        int dañoCausado = (int)(Math.random()*(4-2+1)+2);
        return dañoCausado;
    }
    
    @Override
    public int ataqueEspecial(){
        int dañoCausado = (int)(Math.random()*(20-10+1)+10);
        return dañoCausado;
    }
    

    public int getVida() {
        return vida;
    }
}
