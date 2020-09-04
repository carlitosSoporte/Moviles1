
package pruebadesempeño;

public class Libro extends Material{
    private String Editorial;
    private double Precio;

    public Libro(String Editorial, double Precio, String idMat, String autor, String titulo, boolean estado) {
        super(idMat, autor, titulo, estado);
        this.Editorial = Editorial;
        this.Precio = Precio;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    public String  reparar(){
        return "el libro se ha reparado correctamente";
    }
    
    public String calcDepreciacion(){
        double depreciacion;
        depreciacion = this.Precio * 0.05;
        return "la depreciacion del precio del libro es " + depreciacion;
    }
    
}
