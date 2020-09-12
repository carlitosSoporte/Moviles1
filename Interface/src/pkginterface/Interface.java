
package pkginterface;

public class Interface {
    
    public interface iAnimales{
        public void comer();
        public String correr(int distancia);
        public String enfermar(String enfermedad);
    }
    public static void main(String[] args) {
        
        Perro peluche = new Perro("Blanco");
        peluche.comer();
        System.out.println(peluche.correr(20));
        System.out.println(peluche.enfermar("Flenorragia"));
        System.out.println("el color del pelo es "+peluche.getColorPelo());
        
    }
    
}
