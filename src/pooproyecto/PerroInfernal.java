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
    
    public PerroInfernal(){
        super.vida = (int) (Math.random()*(300-200+1)+200);
        super.nombre="Perro Infernal";
        this.vidaMaxima=this.vida;
    }
    
    @Override
    public int ataque(){
        int dañoCausado = (int)(Math.random()*(6-1+1)+1);
        return dañoCausado;
    }
    
    @Override
    public int ataqueEspecial(){
        int dañoCausado = (int)(Math.random()*(6-1+1)+1)*2;
        return dañoCausado;
    }

}
