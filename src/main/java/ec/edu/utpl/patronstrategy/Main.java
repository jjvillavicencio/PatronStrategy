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
public class Main {
    public static void main(String[] args) {
        Clasico vehiculoClasico = new Clasico();
        Competicion vehiculoCompeticion = new Competicion();
        
        System.out.println("Vehiculo clásico");
        vehiculoClasico.setAlgoritmo(new MoverseNormal());
        vehiculoClasico.mover();
        System.out.println();
        
        System.out.println("Vehiculo de competición");
        vehiculoCompeticion.setAlgoritmo(new MoverseVeloz());
        vehiculoCompeticion.mover();
        System.out.println();
        
        System.out.println("Vehiculo clásico modificado");
        vehiculoClasico.setAlgoritmo(new MoverseVeloz());
        vehiculoClasico.mover();
        System.out.println();
    }
}
