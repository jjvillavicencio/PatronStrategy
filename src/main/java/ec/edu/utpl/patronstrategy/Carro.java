/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.patronstrategy;

/**
 *
 * @author jjvillavicencio
 */
public abstract class Carro {
    private Algoritmo miAlgoritmo;
    
    public void setAlgoritmo(Algoritmo miAlgoritmo){
        this.miAlgoritmo = miAlgoritmo;
    }
    
    public void mover(){
        this.miAlgoritmo.moverse();
    }
}
