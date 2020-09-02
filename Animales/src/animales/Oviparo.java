
package animales;

public class Oviparo extends Animal {

    public Oviparo(float Peso) {
        super(Peso);
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    
    public void ponerHuevos(){
        System.out.println("puse muchos huevos");
    }
    
}
