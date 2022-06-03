/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import modelo.Cliente;

/**
 *
 * @author Gonzalez Maximiliano
 */
public class veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(39,"Gonzalez","Maxi","Santa Rosa",2665,"2665",true);
        Cliente cliente2 = new Cliente(39,"Gonzalez","Maxi","Santa Rosa",2665,"2665",true);
        Cliente cliente3 = new Cliente(39,"Gonzalez","Mario","Santa Rosa",2665,"2665",true);
        
        System.out.println("El primer cliente se llama: " + cliente1.getNombre());
        
        System.out.println(cliente1.equals(cliente2));
        System.out.println(cliente1.equals(cliente3));
        
        //******************
        
        
        
        
        
    }
    
}
