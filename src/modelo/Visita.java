/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Manuel Belgrano Nº3
 */
class Visita {
    int id_visita;
    Date fecha_vista;
    double peso;
    boolean activo;
    Tratamiento tratamiento;
    Mascota mascota;

    public Visita() {
    }
    
    
}
