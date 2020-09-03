
package reinos;

public class Animal {
    public float Peso;

    public Animal(float Peso) {
        this.Peso = Peso;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
    
    public void comer(){
        System.out.println("he comido");
    }
    
}
