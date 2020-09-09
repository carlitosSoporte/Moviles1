
package pkginterface;

import pkginterface.Interface.iAnimales;

public class Caballo implements iAnimales {
    
    
    public void comer(){
        System.out.println("el caballo ha comido");
    }
    public String correr(int distancia){
        return "el caballo recorrió "+distancia;
    }
    public String enfermar(String enfermedad){
        return "el caballo tiene "+enfermedad;
    }
}
