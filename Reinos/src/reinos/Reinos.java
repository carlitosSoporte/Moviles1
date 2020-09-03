
package reinos;

public class Reinos {

    public static void main(String[] args) {
        
        Perro perro1 = new Perro("rosado",true,14);
        System.out.println("Mensaje animal");
        String mensaje = perro1.comer();
        System.out.println(mensaje);
        perro1.ladrar();
        perro1.amamantar();
        
        
        System.out.println();
        System.out.println("Mensaje Oviparo");
        Delfin delfin1 = new Delfin(true,27);
        delfin1.nadar();
        delfin1.amamantar();
        
    }
    
}
