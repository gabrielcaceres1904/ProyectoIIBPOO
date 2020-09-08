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
    
    public void setVida(int vida) {//25
        this.vida = vida;
    }
   
    public void setRecurso(int recurso) { //Mana -> 50
        this.recurso = recurso;
    }

    @Override
    int ataque() {
        return super.damage = (int) ((Math.random()*5)+1);
    }

    @Override
    int ataqueEspecial() {
        recurso -= 10;
        return super.damage = 10;
    }
    
}
