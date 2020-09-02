
package institucion;

public class Empleado extends Persona {
    private String Cargo;
    private int Salario;

    public Empleado(String Cargo, int Salario) {
        this.Cargo = Cargo;
        this.Salario = Salario;
    }

    public Empleado(String Cargo, int Salario, String id) {
        super(id);
        this.Cargo = Cargo;
        this.Salario = Salario;
    }

    public Empleado(String Cargo, int Salario, String id, String nombres) {
        super(id, nombres);
        this.Cargo = Cargo;
        this.Salario = Salario;
    }

 
    

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    
    public boolean contratar(String Id, String Fecha, int valor){
        if(valor > 8000000){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public String liquidar(String Id, String Fecha){
        return "";
    }
    
}
