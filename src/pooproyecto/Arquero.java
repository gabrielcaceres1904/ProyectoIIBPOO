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
public class Arquero extends Heroes {

    public void setVida(int vida) {//20
        this.vida = vida;
    }
   
    public void setRecurso(int recurso) { //Flechas -> 50
        this.recurso = recurso;
    }

    @Override
    int atk() {
        recurso --;
        return super.damage = (int) ((Math.random()*10)+1);
    }

    @Override
    int atkEsp() {
        recurso -= 5;
        return super.damage = (int) ((Math.random()*25)+6);
    }
    
    
}
