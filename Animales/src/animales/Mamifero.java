
package animales;

public class Mamifero extends Animal{
    public boolean SangreCaliente;

    public Mamifero(boolean SangreCaliente, float Peso) {
        super(Peso);
        this.SangreCaliente = SangreCaliente;
    }

    public boolean isSangreCaliente() {
        return SangreCaliente;
    }

    public void setSangreCaliente(boolean SangreCaliente) {
        this.SangreCaliente = SangreCaliente;
    }
 
    public void parir(){
        System.out.println("OMG, he parido");
    }
    
    public void amamantar(){
        System.out.println("OMG, he amamantado");
    }
    
}
