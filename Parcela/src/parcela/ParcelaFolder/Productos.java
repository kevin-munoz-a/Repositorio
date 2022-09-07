package parcela.ParcelaFolder;


public class Productos {
    private int Codigo;
    private String SubCategoria;
    private String Descripcion;
    private int Precio;
    private int Cantidad;
    private String Medida;

     public Productos() {
        this.Codigo=0;
        this.SubCategoria="";
        this.Descripcion="";
        this.Precio=0;
        this.Cantidad=0;
        this.Medida="";
    }  
    
    public Productos(int Codigo, String SubCategoria, String Descripcion, int Precio, int Cantidad, String Medida) {
        this.Codigo=Codigo;
        this.SubCategoria=SubCategoria;
        this.Descripcion=Descripcion;
        this.Precio=Precio;
        this.Cantidad=Cantidad;
        this.Medida=Medida;
    }  


    public int getCodigo() {
        return this.Codigo;
    } 
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }




    public String getSubCategoria() {
        return this.SubCategoria;
    }
    public void setSubCategoria(String SubCategoria) {
        this.SubCategoria = SubCategoria;
    }



    public String getDescripcion() {
        return this.Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }



    public int getPrecio() {
        return this.Precio;
    }
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }



    public int getCantidad(){
        return this.Cantidad;
    }
    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }
    
    
    
    public String getMedida() {
        return this.Medida;
    }
    public void setMedida(String Medida) {
        this.Medida = Medida;
    }

}
