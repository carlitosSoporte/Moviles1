
package pruebadesempeño;

public class PruebaDesempeño {

    public static void main(String[] args) {
        String mensaje;
        //probamos libro
        Libro libro1 = new Libro("Norma",12500,"JKN45-Poliester","Mario Mendoza","Satanas",true);
        
        mensaje = libro1.calcDepreciacion();
        System.out.println(mensaje);
        
        mensaje = libro1.cambiarMat();
        System.out.println(mensaje);
        
        mensaje = libro1.darDeAlta();
        System.out.println(mensaje);
        
        mensaje = libro1.darDeBaja();
        System.out.println(mensaje);
        
        mensaje = libro1.reparar();
        System.out.println(mensaje);
        
        //cambiamos el estado para validar el booleano
        libro1.setEstado(false);
        mensaje = libro1.darDeBaja();
        System.out.println(mensaje);
        
        //mostramos todos sus datos
        System.out.println("el editorial es " + libro1.getEditorial() );
        System.out.println("su precio es de " + libro1.getPrecio() );
        System.out.println("su material es " + libro1.getIdMat() );
        System.out.println("su autor es " + libro1.getAutor() );
        System.out.println("su titulo es " + libro1.getTitulo());
       
    }
    
}
