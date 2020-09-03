
package reinos;

public class Animal {
    private float Peso;

    public Animal() {
    }

    
    public Animal(float Peso) {
        this.Peso = Peso;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
    
    public  String comer(){
        return "El animal está comiendo";
    }
    
}
