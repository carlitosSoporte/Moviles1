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
//        Persona persona = new Persona("12","Felipe");
//        
//        //asignamos valores
//        persona.setId("45");
//        
//        System.out.println("el id es " + persona.getId() );
//        System.out.println("el nombre es " + persona.getNombres() );
//        
//        Persona persona2 = new Persona("32","Pachito");
//        
//        
//        //segundo objeto
//        Estudiante estudiante = new Estudiante("13", 1, "14","Juan");
//        System.out.println("el id es " + estudiante.getId() );
//        System.out.println("el nombre es " + estudiante.getNombres() );
//        
//        System.out.println(estudiante.matricular(estudiante.getId(),estudiante.getIdPrograma()));
//        System.out.println(estudiante.cancelar(estudiante.getId(),estudiante.getIdPrograma()));
//            String mensaje;
//            Docente docente = new Docente("12",true,"7110","Carlitos");
//            docente.setEmail("andrez1915@gmail.com");
//            docente.setEstado(true);
//            docente.setFechaIngreso("12/02/2019");
//            docente.setTelefono("2344045");
//            
//            System.out.println("el nombre del docente es "+docente.getNombres());
//            mensaje = docente.registrarNotas(docente.getId(), "1334N40");
//            System.out.println(mensaje);
//            
//            
//            Empleado empleado = new Empleado("Rector",8500000,"256","Orlando Sanchez");
//            System.out.println(empleado.contratar(empleado.getId(),"12/12/2020", empleado.getSalario()));
//            
//            if(empleado.contratar(empleado.getId(),"12/12/2020", empleado.getSalario())){
//                System.out.println("El contrato es a término definido");
//            }
//            else{
//                System.out.println("el contrato es a término Definido");
//            }
            
            Parqueadero cesde = new Parqueadero();
            cesde.Fecha = "12/12/1212";
            cesde.NumeroPlaca = "123 ldk";
            
            System.out.println("el valor es " + Parqueadero.valor);
            
            
    }
    
    
}
