
package minicalculadora;

public class Operacion {
    private double Numero1;
    private double Numero2;
    private int OperacionMatematica;
    private double Resultado;
   
   
   //suma=1 , resta=2 , multiplicacion=3 , division=4
    private double asignarResultado(){
        
        if(this.OperacionMatematica==1){
            this.Resultado = this.Numero1 + this.Numero2;
        }
        else if(this.OperacionMatematica==2){
            this.Resultado = this.Numero1 - this.Numero2;
        }else if(this.OperacionMatematica == 3){
            this.Resultado = this.Numero1 * this.Numero2;
        }
        else if(this.OperacionMatematica==4){
            this.Resultado = this.Numero1 / this.Numero2;
        }
        
        return this.Resultado;
    }

    
    public Operacion(double Numero1, double Numero2, int OperacionMatematica) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
        this.OperacionMatematica = OperacionMatematica;
        this.Resultado = asignarResultado();
        
    }

    public Operacion(double Numero1, double Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }
    
    

    public double getNumero1() {
        return Numero1;
    }

    public void setNumero1(double Numero1) {
        this.Numero1 = Numero1;
        this.Resultado = asignarResultado();
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
        this.Resultado = asignarResultado();
    }

    public int getOperacionMatematica() {
        return OperacionMatematica;
    }

    public void setOperacionMatematica(int OperacionMatematica) {
        this.OperacionMatematica = OperacionMatematica;
        this.Resultado = asignarResultado();
    }

    public double getResultado() {
        return Resultado;
    }
    
    //suma=1 , resta=2 , multiplicacion=3 , division=4
    public String mostrarResultado(){
        String mensaje;
        if(OperacionMatematica==1){
            mensaje = this.Numero1+" + "+this.Numero2+" = "+this.Resultado;
        }
        else if(OperacionMatematica==2){
            mensaje = this.Numero1+" - "+this.Numero2+" = "+this.Resultado;
        }
        else if(OperacionMatematica==3){
            mensaje = this.Numero1+" * "+this.Numero2+" = "+this.Resultado;
        }
        else{
            mensaje = this.Numero1+" / "+this.Numero2+" = "+this.Resultado;
        }
        
        return mensaje;
    }
    
    
}
