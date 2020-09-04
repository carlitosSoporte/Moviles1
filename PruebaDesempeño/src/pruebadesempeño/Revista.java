
package pruebadesempeño;

public class Revista extends Material {
    
    /*puede ser optimo usar un entero, pero aún no se saben más datos
    por lo tanto se dejará así y usar "semanal" "quincenal" "mensual" "anual" */
    private String Periodicidad;

    public Revista(String Periodicidad, String idMat, String autor, String titulo, boolean estado) {
        super(idMat, autor, titulo, estado);
        this.Periodicidad = Periodicidad;
    }

    public String getPeriodicidad() {
        return Periodicidad;
    }

    public void setPeriodicidad(String Periodicidad) {
        this.Periodicidad = Periodicidad;
    }
    
    
}
