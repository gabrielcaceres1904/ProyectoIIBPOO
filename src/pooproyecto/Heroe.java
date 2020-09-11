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
public abstract class Heroe extends Personaje {

    public void setRecurso(int recurso) {
        this.recurso = recurso;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    protected int recurso;
    protected int recursoMaximo;

    public int getRecurso() {
        return recurso;
    }

    public int getRecursoMaximo() {
        return recursoMaximo;
    }
    
    
}
