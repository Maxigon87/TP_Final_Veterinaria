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
public class Mascota {
    int id_mascota;
    String alias;
    String sexo;
    String especie;
    String raza;
    String color_pelaje;
    Date fecha_nac;
    double peso_actual;
    double peso_promedio;
    boolean activo;
    Cliente cliente;

    public Mascota() {
    }
    
    
}
