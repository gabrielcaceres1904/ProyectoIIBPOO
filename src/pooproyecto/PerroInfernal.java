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
public class PerroInfernal extends Enemigo{
    private int vida = 200;
    
    
    @Override
    public int ataque(){
        int dañoCausado = (int)(Math.random()*1);
        return dañoCausado;
    }
    
    @Override
    public int ataqueEspecial(){
        int dañoCausado = (int)(Math.random()*1)*2;
        return dañoCausado;
    }
    

    public int getVida() {
        return vida;
    }
}
