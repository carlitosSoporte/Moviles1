
package reinos;

public class Reinos {

    public static void main(String[] args) {
        
        Animal animal1 = new Animal(13);
        System.out.println("Mensaje animal");
        animal1.comer();
        
        
        System.out.println();
        System.out.println("Mensaje Oviparo");
        Oviparo oviparo1 = new Oviparo(27);
        oviparo1.comer();
        
    }
    
}
