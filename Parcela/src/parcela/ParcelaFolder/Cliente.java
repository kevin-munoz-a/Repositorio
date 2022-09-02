
package parcela.ParcelaFolder;

public class Cliente {
    public int Run;
    public String Dv;
    public String Nombre;
    public String Email;
    public String Direccion;
    public int Telefono;
    
    public Cliente() {
        this.Run=0;
        this.Dv="";
        this.Nombre="";
        this.Email="";
        this.Direccion="";
        this.Telefono=0;
    }
    
    
    
    
    public int getRun() {
        return this.Run;
    }
    public void setRun(int Run) {
        this.Run = Run;
    }
    
    
    
    
    public String getDv() {
        return this.Dv;
    }
    public void setDv(String Dv){
        this.Dv = Dv;
    }
    
    
    
    
    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    
    
    
    public String getEmail() {
        return this.Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
        
    
    
    public String getDireccion() {
        return this.Direccion;
    }
    public void setDireccion (String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
    public int getTelefono() {
        return this.Telefono;
    }
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
}
