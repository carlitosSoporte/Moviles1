
package reinos;

public class Mamifero extends Animal {
    public boolean sangreCaliente;

    public Mamifero(boolean sangreCaliente, float Peso) {
        super(Peso);
        this.sangreCaliente = sangreCaliente;
    }

    public boolean isSangreCaliente() {
        return sangreCaliente;
    }

    public void setSangreCaliente(boolean sangreCaliente) {
        this.sangreCaliente = sangreCaliente;
    }
    
    public void parir(){
        System.out.println("he parido");
    }
    
    public void amamantar(){
        System.out.println("he amamantado");
    }
    
    
}
