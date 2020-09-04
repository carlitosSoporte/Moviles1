
package pruebadesempeño;

public class Material {
    private String idMat;
    private String autor;
    private String titulo;
    private boolean estado;

    public Material(String idMat, String autor, String titulo, boolean estado) {
        this.idMat = idMat;
        this.autor = autor;
        this.titulo = titulo;
        this.estado = estado;
    }

    public String getIdMat() {
        return idMat;
    }

    public void setIdMat(String idMat) {
        this.idMat = idMat;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String darDeAlta(){
        return "Ha ingresado al sistema";
    }
    
    public String darDeBaja(){
        
        if(!this.estado){
            return "Se ha retirado del sistema";
        }
        else{
            return "no puede darse de baja, el estado es activo";
        }
    }
    
    public String cambiarMat(){
        return "se ha cambiado el material";
    }
    
    
}
