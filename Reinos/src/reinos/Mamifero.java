
package reinos;

public class Mamifero extends Animal {
    private boolean sangreCaliente;

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
        System.out.println("El mamifero esta pariendo...");
    }
    
    public void amamantar(){
        System.out.println("El mamifero esta amamantando...");
    }
    
    
}
