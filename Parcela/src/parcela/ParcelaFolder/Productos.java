
package parcela.ParcelaFolder;


public class Productos {
    public int Codigo;
    public String SubCategoria;
    public String Descripcion;
    public int Precio;
    public int Unidad_gramos;
    
    public Productos() {
        this.Codigo=0;
        this.SubCategoria="";
        this.Descripcion="";
        this.Precio=0;
        this.Unidad_gramos=0;
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
    
    
    
    public int getUnidad_gramos(){
        return this.Unidad_gramos;
    }
    public void setUnidad_gramos(int Unidad_gramos){
        this.Unidad_gramos = Unidad_gramos;
    }
    
}
