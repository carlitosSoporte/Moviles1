
package institucion;

public class Docente extends Persona {
    private String IdAsignatura;
    private boolean TipoContrato;

    public Docente(String IdAsignatura, boolean TipoContrato) {
        this.IdAsignatura = IdAsignatura;
        this.TipoContrato = TipoContrato;
    }

    public Docente(String IdAsignatura, boolean TipoContrato, String id) {
        super(id);
        this.IdAsignatura = IdAsignatura;
        this.TipoContrato = TipoContrato;
    }

    public Docente(String IdAsignatura, boolean TipoContrato, String id, String nombres) {
        super(id, nombres);
        this.IdAsignatura = IdAsignatura;
        this.TipoContrato = TipoContrato;
    }

    public String getIdAsignatura() {
        return IdAsignatura;
    }

    public void setIdAsignatura(String IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    public boolean isTipoContrato() {
        return TipoContrato;
    }

    public void setTipoContrato(boolean TipoContrato) {
        this.TipoContrato = TipoContrato;
    }

    
    
    
    public String registrarNotas(String Id, String IdAsignatura){
        return "El profesor con "+Id+" esta registrando la nota con Id de Asignatura "+IdAsignatura;
    }
    
    public String AsentarTemas(){
        return "El profesor ha asentado los temas de forma correctamente";
    }
}
