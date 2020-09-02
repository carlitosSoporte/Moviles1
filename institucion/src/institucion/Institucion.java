/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author Usuario
 */
public class Institucion {

  
    public static void main(String[] args) {
        
        
        //instanciamos el objeto
        Persona persona = new Persona("12","Felipe");
        
        //asignamos valores
        persona.setId("45");
        
        System.out.println("el id es " + persona.getId() );
        System.out.println("el nombre es " + persona.getNombres() );
        
        Persona persona2 = new Persona("32","Pachito");
        
        
        //segundo objeto
        Estudiante estudiante = new Estudiante("13", 1, "14","Juan");
        System.out.println("el id es " + estudiante.getId() );
        System.out.println("el nombre es " + estudiante.getNombres() );
        
        System.out.println(estudiante.matricular(estudiante.getId(),estudiante.getIdPrograma()));
        System.out.println(estudiante.cancelar(estudiante.getId(),estudiante.getIdPrograma()));
        

    }
    
    
}
