
package animales;

public class Delfin extends Mamifero {

    public Delfin(boolean SangreCaliente, float Peso) {
        super(SangreCaliente, Peso);
    }

    public boolean isSangreCaliente() {
        return SangreCaliente;
    }

    public void setSangreCaliente(boolean SangreCaliente) {
        this.SangreCaliente = SangreCaliente;
    }
    
    
    public void nadar(){
        System.out.println("OMG, he nadado");
    }
}
