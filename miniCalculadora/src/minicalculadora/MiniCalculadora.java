
package minicalculadora;

public class MiniCalculadora {

    public static void main(String[] args) {
        
        String mensaje;
        
        Suma suma1 = new Suma(1,39);
        mensaje = suma1.mostrarResultado();
        System.out.println(mensaje);
        
        Resta resta1 = new Resta(3,2);
        mensaje  = resta1.mostrarResultado();
        System.out.println(mensaje);
        
        Division division1 = new Division(4,2);
        mensaje = division1.mostrarResultado();
        System.out.println(mensaje);
        
        Multiplicacion multiplicacion1 = new Multiplicacion(3,5);
        mensaje = multiplicacion1.mostrarResultado();
        System.out.println(mensaje);
        
    }
    
}
