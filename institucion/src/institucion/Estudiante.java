
package institucion;

public class Estudiante extends Persona{
    
    private String IdPrograma;
    private int NumeroMatricula;
    
    public Estudiante(){
        
    }

    public Estudiante(String IdPrograma, int NumeroMatricula) {
        this.IdPrograma = IdPrograma;
        this.NumeroMatricula = NumeroMatricula;
    }

    public Estudiante(String IdPrograma, int NumeroMatricula, String id) {
        super(id);
        this.IdPrograma = IdPrograma;
        this.NumeroMatricula = NumeroMatricula;
    }

    public Estudiante(String IdPrograma, int NumeroMatricula, String id, String nombres) {
        super(id, nombres);
        this.IdPrograma = IdPrograma;
        this.NumeroMatricula = NumeroMatricula;
    }

    public String getIdPrograma() {
        return IdPrograma;
    }

    public void setIdPrograma(String IdPrograma) {
        this.IdPrograma = IdPrograma;
    }

    public int getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(int NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }
    
   public String matricular(String Id, String IdPrograma){
       
       return "se ha matriculado el estudiante con id "+Id+" y tiene un id de programa "+IdPrograma;
   }
   
   public String cancelar(String Id, String IdPrograma){
       
       return "se ha cancelando la matricula del estudiante con id "+Id+" y tiene un id de programa "+IdPrograma;
   }
    
}
