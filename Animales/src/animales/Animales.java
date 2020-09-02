
package animales;
import java.util.Scanner;


public class Animales {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("PRUEBA DE CLASE ANIMAL");
        System.out.println("---------------------------------------------------------");
        //instanciamos objeto de clase Animal
        Animal animal = new Animal(12);
        System.out.println("Mi peso es "+animal.getPeso());
        animal.comer();
        
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("");
        System.out.println("De clic aquí y presione una tecla para continuar...");
        teclado.nextLine();
        System.out.println();
        System.out.println();
        
        
        
        
        System.out.println("PRUEBA DE CLASE OVIPARO");
        System.out.println("---------------------------------------------------------");
        //instanciamos objeto de clase Oviparo
        Oviparo oviparo = new Oviparo(14);
        oviparo.setPeso(16);
        System.out.println("Mi peso es "+oviparo.getPeso());
        oviparo.comer();
        oviparo.ponerHuevos();
    }
    
}
