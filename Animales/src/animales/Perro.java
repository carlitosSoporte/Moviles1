
package animales;

public class Perro extends Mamifero {
    public String ColorPelo;

    public Perro(String ColorPelo, boolean SangreCaliente, float Peso) {
        super(SangreCaliente, Peso);
        this.ColorPelo = ColorPelo;
    }

    public String getColorPelo() {
        return ColorPelo;
    }

    public void setColorPelo(String ColorPelo) {
        this.ColorPelo = ColorPelo;
    }
    
    
    public void ladrar(){
        System.out.println("Wuaaaauuuuu");
        System.out.println("Grrrrrrr");
         System.out.println("Wuaaaauuuuu");
    }
}
