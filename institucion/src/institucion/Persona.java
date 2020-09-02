
package institucion;


public class Persona {
    
    //definición de atributos
    private String Id ;
    private String Nombres;
    private String Email;
    private String Telefono;
    private String FechaIngreso;
    private boolean Estado;
    
    
    //constructor
    public Persona(){
        
    }
    
    
    //segundo constructor
    public Persona(String id){
        this.Id = Id;
    }
    
    //tercer constructor
    public Persona(String id, String nombres){
        
        this.Id = id;
        this.Nombres = nombres;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
    

    
    
    //método contar
    public void contar(){
        System.out.println("Se ha contado esta persona");
    }
    
  
    
    
            
}


