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
public class Mago extends Heroes {
    
    public void setVida(int vida) {//15
        this.vida = vida;
    }
   
    public void setRecurso(int recurso) { //Mana -> 100
        this.recurso = recurso;
    }

    @Override
    int atk() {
        return super.damage = (int) ((Math.random()*15)+1);
    }

    @Override
    int atkEsp() {
        recurso -= 10;
        return super.damage = (int) ((Math.random()*30)+5);
    }
    
}
