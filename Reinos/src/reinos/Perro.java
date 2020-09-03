
package reinos;

public class Perro extends Mamifero{
    private String colorPelo;

    public Perro(String colorPelo, boolean sangreCaliente, float Peso) {
        super(sangreCaliente, Peso);
        this.colorPelo = colorPelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    public void ladrar(){
        System.out.println("El perro está ladrando");
    }
    
}
