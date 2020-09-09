
package pkginterface;

import pkginterface.Interface.iAnimales;

public class Perro implements iAnimales {
    private String colorPelo;

    public Perro(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    public void comer(){
        System.out.println("el perro esta corriendo...");
    }
    public String correr(int distancia){
        return "el perro recorrió "+distancia+" kilometros";
    }
    public String enfermar(String enfermedad){
        return "el perro tiene la enfermedad de "+enfermedad;
    }
    
    
    
}
