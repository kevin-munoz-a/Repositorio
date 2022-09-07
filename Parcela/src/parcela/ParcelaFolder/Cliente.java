package parcela.ParcelaFolder;

public class Cliente {
    private int Run;
    private String Dv;
    private String Nombre;
    private String Mail;
    private String Direccion;
    private int Telefono;

    public Cliente() {
        this.Run=0;
        this.Dv="";
        this.Nombre="";
        this.Mail="";
        this.Direccion="";
        this.Telefono=0;
    }

    public Cliente(int Run, String Dv, String Nombre, String Mail, String Direccion, int Telefono) {
        this.Run = Run;
        this.Dv = Dv;
        this.Nombre = Nombre;
        this.Mail = Mail;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
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
        return this.Mail;
    }
    public void setEmail(String Email) {
        this.Mail = Email;
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
